package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long typeId;
    private String name;
    private String mm;
    private String ms;
    private String kg;
    private String explosive;
}
