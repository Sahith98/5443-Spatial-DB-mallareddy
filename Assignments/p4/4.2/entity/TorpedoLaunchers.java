package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TorpedoLaunchers")
public class TorpedoLaunchers {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long torpedoLaunchersId;
   private String location;
   private String side;
   private String facing;
   @OneToOne(targetEntity=Torpedos.class,cascade = CascadeType.ALL)
   private Torpedos torpedos;
}
