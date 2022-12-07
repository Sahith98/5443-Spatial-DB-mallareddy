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
@Table(name = "ships")
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String category;
    private String shipClass;
    private String length;
    private String width;
    @OneToMany(targetEntity=Armament.class,cascade = CascadeType.ALL)
    private List<Armament> armament;
    @OneToMany(targetEntity=TorpedoLaunchers.class,cascade = CascadeType.ALL)
    private List<TorpedoLaunchers> torpedoLaunchers;
    @OneToOne(targetEntity=Armor.class,cascade = CascadeType.ALL)
    private Armor armor;
    private String speed;
    private String turn_radius;
    private String location;

    public Ship(
                String category,
                String shipClass,
                String length,
                String width,
                List<TorpedoLaunchers> torpedoLaunchers,
                List<Armament> armament,
                Armor armor,
                String speed,
                String turn_radius,
                String location

    ) {
    }
}
