package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="projectile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectile {
    @Id
    private String name;
    private float kg;
    private Integer mm;


}
