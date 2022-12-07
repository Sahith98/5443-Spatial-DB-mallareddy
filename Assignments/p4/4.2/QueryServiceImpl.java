package com.battle.ship.service;

import com.battle.ship.entity.*;
import com.battle.ship.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl {

    @Autowired
    CartridgeRepository cartridgeRepository;

    @Autowired
    GunStateRepository gunStateRepository;

    @Autowired
    ProjectileRepository projectileRepository;

    @Autowired
    ShipGunsRepository shipGunsRepository;

    @Autowired
    ShipRepository shipRepository;

    @Autowired
    ShipStateRepository shipStateRepository;

    @Autowired
    TorpedoRepository torpedoRepository;

    @Autowired
    TorpedoStateRepository torpedoStateRepository;

    public List<Cartridge> getAllCartridge(){
        return cartridgeRepository.findAll();
    }

    public List<GunState> getAllGunState(){
        return gunStateRepository.findAll();
    }

    public List<Projectile> getAllProjectile(){
        return projectileRepository.findAll();
    }

    public List<ShipsGuns> getAllShipsGuns(){
        return shipGunsRepository.findAll();
    }

    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    public List<Torpedo> getAllTorpedo(){
        return torpedoRepository.findAll();
    }

    public List<TorpedoState> getAllTorpedoState(){
        return torpedoStateRepository.findAll();
    }


    public List<ShipState> getAllShipState(){
        return shipStateRepository.findAll();
    }
}
