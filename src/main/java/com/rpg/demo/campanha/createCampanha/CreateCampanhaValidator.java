package com.rpg.demo.campanha.createCampanha;

import org.springframework.stereotype.Component;

@Component
public class CreateCampanhaValidator {

    public void validate(CreateCampanhaDto campanhaDto) {
        if(campanhaDto.getNome() == null || campanhaDto.getNome().isBlank()){
            throw new IllegalArgumentException("Nome da campanha é obrigatório");
        }

        if(campanhaDto.getData() == null){
            throw new IllegalArgumentException("A data da campanha é obrigatório");
        }

        if(campanhaDto.getPerfilId() == null){
            throw new IllegalArgumentException("Perfil é obrigatório");
        }
    }
}
