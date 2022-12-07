package com.battle.ship.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="torpedo_state")
public class TorpedoState {
    @Id
    /*@ManyToOne
    @JoinColumn(name ="FK_t_id")*/
    private Long ship_id;
    /*@ManyToOne
    @JoinColumn(name ="FK_ship_id")*/
    private String t_id;
    private String location;
    private String side;
    private String facing;
    private Integer warheadsize;
    private Integer range;


}
