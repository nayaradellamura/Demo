package com.rpg.demo.usuario.updateUser;

import com.rpg.demo.usuario.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserValidator {

    public void validate(UpdateUserDto userDto, UsuarioEntity usuario) {
        if (userDto.getSenha() != null && userDto.getSenha().isBlank()) {
            throw new IllegalArgumentException("Senha não pode estar em branco");
        }

        if (userDto.getNome() != null && userDto.getNome().length() < 3) {
            throw new IllegalArgumentException("Nome muito curto");
        }
    }
}
