package com.rpg.demo.perfil.findPerfil;

import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import com.rpg.demo.perfil.repositoryPerfil.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPerfilService {

    private final PerfilRepository perfilRepository;

    public FindPerfilService(PerfilRepository perfilRepository) { this.perfilRepository = perfilRepository; }

    public FindPerfilDto buscarPorId(Long id) {
        PerfilEntity perfil = perfilRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Perfil não encontrado"));

        return FindPerfilMapper.toDto(perfil);
    }

    public List<FindPerfilDto> buscarTodos() {
        List<PerfilEntity> perfil = perfilRepository.findAll();
        return FindPerfilMapper.toDtoList(perfil);
    }
}
