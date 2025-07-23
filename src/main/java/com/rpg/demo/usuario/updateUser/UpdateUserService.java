package com.rpg.demo.usuario.updateUser;

import com.rpg.demo.usuario.entity.UsuarioEntity;
import com.rpg.demo.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UpdateUserValidator updateUserValidator;

    public UsuarioEntity execute(long id, UpdateUserDto userDto) {
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        updateUserValidator.validate(userDto, usuario);
        UpdateUserMapper.updateEntity(usuario, userDto);

        return usuarioRepository.save(usuario);
    }
}
