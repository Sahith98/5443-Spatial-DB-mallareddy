package com.battle.ship.controller;

import com.battle.ship.entity.*;
import com.battle.ship.service.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryResource {

    @Autowired
    QueryServiceImpl queryService;

    @GetMapping("/cartridge")
    public ResponseEntity<List<Cartridge>> getAllCartridge(){
        return new ResponseEntity<>(queryService.getAllCartridge(), HttpStatus.OK);
    }

    @GetMapping("/gunState")
    public ResponseEntity<List<GunState>> getAllGunState(){
        return new ResponseEntity<>(queryService.getAllGunState(), HttpStatus.OK);
    }

    @GetMapping("/projectile")
    public ResponseEntity<List<Projectile>> getAllProjectile(){
        return new ResponseEntity<>(queryService.getAllProjectile(), HttpStatus.OK);
    }

    @GetMapping("/shipsGuns")
    public ResponseEntity<List<ShipsGuns>> getAllShipsGuns(){
        return new ResponseEntity<>(queryService.getAllShipsGuns(), HttpStatus.OK);
    }

    @GetMapping("/ships")
    public ResponseEntity<List<Ship>> getAllShips(){
        return new ResponseEntity<>(queryService.getAllShips(), HttpStatus.OK);
    }

    @GetMapping("/shipState")
    public ResponseEntity<List<ShipState>> getAllShipState(){
        return new ResponseEntity<>(queryService.getAllShipState(), HttpStatus.OK);
    }

    @GetMapping("/torpedo")
    public ResponseEntity<List<Torpedo>> getAllTorpedo(){
        return new ResponseEntity<>(queryService.getAllTorpedo(), HttpStatus.OK);
    }

    @GetMapping("/torpedoState")
    public ResponseEntity<List<TorpedoState>> getAllTorpedoState(){
        return new ResponseEntity<>(queryService.getAllTorpedoState(), HttpStatus.OK);
    }

}
