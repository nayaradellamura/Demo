package com.rpg.demo.perfil.createPerfil;

import org.springframework.stereotype.Component;

@Component
public class CreatePerfilValidator {

    public void validate(CreatePerfilDto perfilDto) {
        if (perfilDto.getTipo() == null || perfilDto.getTipo().isBlank()) {
            throw new IllegalArgumentException("Tipo do perfil é obrigatório");
        }
    }
}
