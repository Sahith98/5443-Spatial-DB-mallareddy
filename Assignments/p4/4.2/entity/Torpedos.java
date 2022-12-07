package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Torpedos")
public class Torpedos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long torpedosId;
    private String name;
    private String guidance;
    private String diameter;
    private String speed;
    private String kg;
    private String warheadSize;
    private String range;
}
