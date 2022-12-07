package com.battle.ship.entity;

import javax.persistence.*;

@Entity
@Table(name ="torpedo")
public class Torpedo {
    @Id
    private String name;
    private String guidance;
    private Integer diameter;
    private Integer speed;
    private Float kg;
    private Integer warheadsize;
    private Integer range;


}
