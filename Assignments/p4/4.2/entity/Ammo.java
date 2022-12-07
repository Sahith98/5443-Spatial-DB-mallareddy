package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ammo")
public class Ammo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ammoId;
    private String count;
    @OneToOne(targetEntity=Type.class,cascade = CascadeType.ALL)
    private Type type;

}
