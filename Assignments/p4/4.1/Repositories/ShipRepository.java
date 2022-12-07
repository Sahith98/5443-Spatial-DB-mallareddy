package com.battleship.game.repository;

import com.battleship.game.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShipRepository extends JpaRepository<Ship, Long> {

  public List<Ship> findByIdContaining(int id);

 @Query(value = "SELECT COUNT(*) FROM Ship")
  public int noOfBoatsCount();
}
