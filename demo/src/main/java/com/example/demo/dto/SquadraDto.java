package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SquadraDto {

    private String nome;

    private AllenatoreDto allenatore;
    private Set<GiocatoreDto> giocatori;


}
