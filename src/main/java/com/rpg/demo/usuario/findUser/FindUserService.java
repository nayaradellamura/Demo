package com.rpg.demo.usuario.findUser;

import com.rpg.demo.usuario.entityUser.UsuarioEntity;
import com.rpg.demo.usuario.repositoryUser.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindUserService {

    private final UsuarioRepository usuarioRepository;

    public FindUserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public FindUserDto buscarPorId(Long id) {
        UsuarioEntity usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        return FindUserMapper.toDto(usuario);
    }

    public List<FindUserDto> buscarTodos() {
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        return FindUserMapper.toDtoList(usuarios);
    }
}
