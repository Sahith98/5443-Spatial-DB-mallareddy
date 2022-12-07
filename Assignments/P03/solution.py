from fastapi import FastAPI     
from pydantic import BaseModel  

import uvicorn  

class MissileSol(BaseModel):
    Id:   str   
    Lon1: float 
    Lat1: float
    Alt1: float 
    Time: int   
    Type: int   
    Lon2: float 
    Lat2: float 
    Alt2: float 

app = FastAPI()

@app.post("/missileSolution/")
async def create_item(missSol: Missilesol):
    print(miss_sol)
    return miss_sol
    

if __name__ == "__main__":
    uvicorn.run("postApi:app", host="127.0.0.1", port=8080, log_level="debug", reload=True)
