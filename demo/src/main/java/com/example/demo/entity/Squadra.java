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
public class Squadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50, nullable = false, unique = true)
    private String nomeSquadra;

    @OneToOne(mappedBy = "squadra", cascade = CascadeType.ALL, orphanRemoval = true)
    private Allenatore allenatore;

    @ManyToMany
    @JoinTable(
            name = "giocatore_squadra",
            joinColumns = @JoinColumn(name = "idSquadra"),
            inverseJoinColumns = @JoinColumn(name = "idGiocatore"))
    private Set<Giocatore> giocatori = new HashSet<>();

}
