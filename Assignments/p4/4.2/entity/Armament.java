package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Armament")
public class Armament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long armamentId;
    @OneToOne(targetEntity=Gun.class,cascade = CascadeType.ALL)
    private Gun gun;
    private String pos;
}
