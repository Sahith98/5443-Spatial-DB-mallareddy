package com.battle.ship.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "cartridge")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cartridge {

    @Id
    private String name;
    private Integer mm;
    private Double kg;
    private Integer ms;
    private Integer explosive;

}
