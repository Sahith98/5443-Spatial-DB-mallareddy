

from re import S
from fastapi import FastAPI
from fastapi.responses import RedirectResponse
import uvicorn
import psycopg2
import json

from time import sleep

class DatabaseCursor(object):

    def __init__(self, conn_config_file):
        with open(conn_config_file) as config_file:
            self.conn_config = json.load(config_file)

    def __enter__(self):
        self.conn = psycopg2.connect(
            "dbname='"
            + self.conn_config["dbname"]
            + "' "
            + "user='"
            + self.conn_config["user"]
            + "' "
            + "host='"
            + self.conn_config["host"]
            + "' "
            + "password='"
            + self.conn_config["password"]
            + "' "
            + "port="
            + self.conn_config["port"]
            + " "
        )
        #  
        self.cur = self.conn.cursor()
        self.cur.execute("SET search_path TO " + self.conn_config["schema"])

        return self.cur

    def __exit__(self, exc_type, exc_val, exc_tb):
        self.conn.commit()
        self.conn.close()

description = """PROJECT 3 """

app = FastAPI(
    title = "MILITARY BASES",
    version = "0.0.1",
    contact = {
        "name": "SHEILD",
        "url": "https://www.linkedin.com/in/yanalasrikanth/",
    },
    license_info = {
        "name": "Apache 2.0",
        "url": "https://www.apache.org/licenses/LICENSE-2.0.html",
    },
)

@app.get("/")
async def docs_redirect():
    """
   
    """
    return RedirectResponse(url="/docs")



@app.get("/interpolation_points")
async def get_interpolate():
    sql = """SELECT ST_AsGeoJSON(
                ST_LineInterpolatePoints('LINESTRING(-121.81640624999999 54.36775852406841,-86.396484375 19.72534224805787)', 0.01))"""
                
    with DatabaseCursor(".config.json") as cur:
        cur.execute(sql)
        return cur.fetchall()

@app.get("/bbox")
async def get_bbox():
    sql = """SELECT fullname,ST_AsText(ST_Envelope(geom)) bbox,  ST_AsText(ST_Centroid(ST_Envelope(geom))) bboxcenter,  ST_AsText(ST_Centroid(geom)) center
                FROM us_mil ORDER BY fullname ASC"""
    with DatabaseCursor(".config.json") as cur:
        cur.execute(sql)
        return cur.fetchall()

@app.get("/radar_sweep")
def radar_sweep():
    
        sleep(1)


@app.get("/area")
async def get_area():
    sql = """SELECT fullname,ST_Area(geom::geography)* 0.00000038610 sqmiles 
                FROM military_bases ORDER BY sqmiles DESC"""
        
    with DatabaseCursor(".config.json") as cur:
        cur.execute(sql)
        return cur.fetchall()
if __name__ == "__main__":
    uvicorn.run("api:app", port=8000, reload=True)
