package com.battle.ship.entity;

import javax.persistence.*;

@Entity
@Table(name ="ships_guns")
public class ShipsGuns {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*@ManyToOne
    @JoinColumn(name ="FK_ships_id")*/
    private Long ship_id;
    /*@ManyToOne
    @JoinColumn(name ="FK_gun_name")*/
    private String gun_id;
    private String type;
    private Integer pos;


}
