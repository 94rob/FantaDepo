package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Giocatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50,  nullable = false, unique = true)
    private String nomeGiocatore;

    @Column(nullable = false)
    private int valore;

    @ManyToMany(mappedBy = "giocatori")
    Set<Squadra> squadre = new HashSet<>();

}
