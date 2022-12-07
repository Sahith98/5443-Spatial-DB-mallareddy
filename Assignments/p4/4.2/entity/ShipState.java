package com.battle.ship.entity;

import javax.persistence.*;

@Entity
@Table(name ="ship_state")
public class ShipState {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*@ManyToOne
    @JoinColumn(name ="PK_ship_state,FK_ship_state_SHIP_ID")*/
    private Long ship_id;
    private Float bearing;
    private Integer speed;
    private String pos;


}
