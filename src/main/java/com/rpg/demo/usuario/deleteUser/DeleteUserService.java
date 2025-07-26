package com.rpg.demo.usuario.deleteUser;

import com.rpg.demo.usuario.repositoryUser.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserService {

    private final UsuarioRepository usuarioRepository;

    public void delete(Long id) {
        if (!usuarioRepository.existsById(id)){
            throw new EntityNotFoundException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}
