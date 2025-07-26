package com.rpg.demo.perfil.deletePerfil;

import com.rpg.demo.perfil.repositoryPerfil.PerfilRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletePerfilService {

    private final PerfilRepository perfilRepository;

    public void delete(Long id) {
        if (!perfilRepository.existsById(id)) {
            throw new EntityNotFoundException("Perfil não encontrado");
        }
        perfilRepository.deleteById(id);
    }
}
