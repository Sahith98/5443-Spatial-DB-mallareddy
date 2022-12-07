package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Gun")
public class Gun {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long gunId;
    private String name;
    private String info;
    private String mm;
    @ElementCollection
    private List<String> ammoType;
    @OneToMany(targetEntity=Ammo.class,cascade = CascadeType.ALL)
    private List<Ammo> ammo;
    private String rof;
    private String propellant;
}
