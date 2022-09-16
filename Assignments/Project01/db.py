from sqlalchemy import create_engine

engine = create_engine(
    "postgresql://postgres:1430@localhost/Project01",
)


class DB:
    table_name = "airport"

    def get_all(self):
        with engine.connect() as conn:
            res = conn.execute("SELECT * FROM {}".format(self.table_name))
            return res.fetchall()

    def find(self, **kwargs):
        with engine.connect() as conn:
            where = " AND ".join(["{}='{}'".format(k, v) for k, v in kwargs.items()])
            res = conn.execute(
                "SELECT * FROM {} WHERE {}".format(self.table_name, where)
            )
            return res.fetchall()

    def find_closest(self, lat, lon):
        with engine.connect() as conn:
            res = conn.execute(
                "SELECT * FROM {} ORDER BY ST_DistanceSphere(ST_MakePoint({}, {}), ST_MakePoint(lon, lat)) LIMIT 1;".format(
                    self.table_name,
                    lon,
                    lat,
                )
            )
            return res.fetchall()


db = DB()
