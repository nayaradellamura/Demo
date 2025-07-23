package com.rpg.demo.usuario.createUser;

import com.rpg.demo.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CreateUserValidator {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void validate(CreateUserDto dto) {
        if (!StringUtils.hasText(dto.getNome())) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (!StringUtils.hasText(dto.getEmail())) {
            throw new IllegalArgumentException("Email é obrigatório");
        }

        if (!dto.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }

        if (!StringUtils.hasText(dto.getSenha()) || dto.getSenha().length() < 6) {
            throw new IllegalArgumentException("Senha deve ter no mínimo 6 caracteres");
        }

        // Verificar se email já existe
        boolean exists = usuarioRepository.findByEmail(dto.getEmail()).isPresent();
        if (exists) {
            throw new IllegalArgumentException("Email já está em uso");
        }
    }

}
