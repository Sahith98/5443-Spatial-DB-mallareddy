package com.battleship.game.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CardinalRepository extends JpaRepository<List,Long> {

  @Query(value = "SELECT ST_AsGeoJson(ST_MakeEnvelope(-10.31324002, 48.74631646, -8.06068579, 50.17116998, 4326))",nativeQuery = true)
  List<Double> findBoundingBox(int id);

  @Query(value = "SELECT ST_AsGeoJson(ST_Centroid(ST_GeomFromGeoJSON(':bbox')))",nativeQuery = true)
  List<Double> findCenterPoint(String bbox);

  @Query(value = "SELECT ST_AsGeoJSON(ST_Intersection(ST_Project(ST_GeomFromGeoJSON(':Center'), 80000, radians(':left')), ST_GeomFromGeoJSON(':bbox')))",nativeQuery = true)
  List<Double> findextremesShipRegionP1(String Center, String left,String bbox);

  @Query(value = "SELECT ST_AsGeoJSON(ST_Intersection(ST_Project(ST_GeomFromGeoJSON(':Center'), 80000, radians(':right')), ST_GeomFromGeoJSON(':bbox')))",nativeQuery = true)
  List<Double> findextremesShipRegionRightP2(String Center, String right,String bbox);

  @Query(value = "SELECT ST_AsGeoJSON(ST_MakePolygon(ST_MakeLine((ARRAY[ST_GeomFromGeoJSON(':Center'), ST_GeomFromGeoJSON(':p1'), ST_GeomFromGeoJSON(':p2'), ST_GeomFromGeoJSON(':Center')]))))",nativeQuery = true)
  List<Double> findCenterAndExtremes(String Center,String p1, String p2);

  @Query(value = "SELECT ST_AsGeoJSON(ST_Centroid(ST_GeomFromGeoJSON(':region')))",nativeQuery = true)
  List<Double> findBoatsAroundBackBoat(String region);

}
