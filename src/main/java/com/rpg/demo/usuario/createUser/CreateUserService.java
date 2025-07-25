package com.rpg.demo.usuario.createUser;

import com.rpg.demo.usuario.entityUser.UsuarioEntity;
import com.rpg.demo.usuario.repositoryUser.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired CreateUserValidator createUserValidator;

    public UsuarioEntity criarUsuario(CreateUserDto userDto) {
        createUserValidator.validate(userDto);
        UsuarioEntity usuario = CreateUserMapper.toEntity(userDto);
        return usuarioRepository.save(usuario);
    }
}
