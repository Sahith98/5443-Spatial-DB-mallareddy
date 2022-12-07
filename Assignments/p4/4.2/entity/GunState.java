package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.*;

@Entity
@Table(name = "gun_state")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GunState {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    /*@ManyToOne
    @JoinColumn(name ="FK_ship_id")*/
    private Integer ship_id;
    /*@ManyToOne
    @JoinColumn(name ="FK_gun_id")*/
    private String gun_id;
    private String bearing;
    private String elevation;
    private String ammo;



}
