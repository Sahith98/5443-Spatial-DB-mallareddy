package com.battleship.game.repository;

import com.battleship.game.constants.BattleShipConstants;
import com.battleship.game.model.PolygonCoordinates;
import com.battleship.game.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovingShipRepository extends JpaRepository<List,Long> {

    @Query(value = BattleShipConstants.NEXT_ONE)
    public PolygonCoordinates movingRadiansPosition(String region);

    @Query(value = BattleShipConstants.UPDATE_QUERY)
    public void updateshipMovingPosition(double region_one,long id);
}
