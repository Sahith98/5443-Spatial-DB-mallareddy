package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Armor")
public class Armor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long armorId;
    private String hull;
    private String deck;
}
