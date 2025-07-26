package com.rpg.demo.campanhaParticipante.createCampanhaPart;

import org.springframework.stereotype.Component;

@Component
public class CreateCampanhaPartValidator {

    public void validate(CreateCampanhaPartDto campanhaPartDto) {
        if(campanhaPartDto.getPerfilId() == null){
            throw new IllegalArgumentException("O Perfil é obrigatório");
        }

        if(campanhaPartDto.getCampanhaId() == null){
            throw new IllegalArgumentException("A Campanha é obrigatória");
        }
    }
}
