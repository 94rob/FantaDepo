package com.example.demo.service;

import com.example.demo.dto.GiocatoreDto;
import com.example.demo.entity.Giocatore;
import com.example.demo.repository.GiocatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiocatoreServiceImpl {

    @Autowired
    GiocatoreRepository giocatoreRepository;

    @Autowired
    ModelMapper modelMapper;

    public void save(Giocatore giocatore){
        this.giocatoreRepository.save(giocatore);
    }

    public GiocatoreDto findByNomeGiocatoreLike(String nome){
        Giocatore giocatore = this.giocatoreRepository.findByNomeGiocatoreLike(nome);
        return this.convertToDto(giocatore);
    }
}
