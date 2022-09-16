from flask import Flask, request, jsonify, render_template
from db import db

app = Flask(__name__)


@app.route("/findAll", methods=["GET"])
def find_all():
    res = db.get_all()
    dicts = [dict(row) for row in res]
    return render_template("table.html",result=dicts)


@app.route("/findOne", methods=["GET"])
def find_one():
    res = db.find(**request.args)
    return render_template("table.html",result=[dict(res[0])] if res else [])


@app.route("/findClosest", methods=["GET"])
def find_closest():
    lat = request.args.get("lat")
    lon = request.args.get("lon")
    res = db.find_closest(lat, lon)

    return render_template("table.html",result=[dict(res[0])] if res else [])


if __name__ == "__main__":
    app.run(port=8010, debug=True)
