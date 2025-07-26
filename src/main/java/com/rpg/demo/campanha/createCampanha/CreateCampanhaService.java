package com.rpg.demo.campanha.createCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanha.repositoryCampanha.CampanhaRepository;
import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import com.rpg.demo.perfil.repositoryPerfil.PerfilRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCampanhaService {

    private final PerfilRepository perfilRepository;
    private final CampanhaRepository campanhaRepository;
    private final CreateCampanhaValidator createCampanhaValidator;
    private final CreateCampanhaMapper createCampanhaMapper;

    public CampanhaEntity criarCampanha(CreateCampanhaDto campanhaDto) {
        createCampanhaValidator.validate(campanhaDto);

        PerfilEntity perfil = perfilRepository.findById(campanhaDto.getPerfilId())
                .orElseThrow(() -> new IllegalArgumentException("Perfil não encontrado"));

        CampanhaEntity campanha = createCampanhaMapper.toEntity(campanhaDto, perfil);
        return campanhaRepository.save(campanha);
    }
}
