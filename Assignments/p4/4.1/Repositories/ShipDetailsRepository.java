package com.battleship.game.repository;

import com.battleship.game.response.BattleShipResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

public interface ShipDetailsRepository extends JpaRepository<BattleShipResponse, Long> {
  @Query(value = "SELECT id, bearing, ST_asGeoJSON(location) FROM ships ORDER BY id ASC")
  public BattleShipResponse getBattleshipDetails();
}
