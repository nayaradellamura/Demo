package com.rpg.demo.campanhaParticipante.createCampanhaPart;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanha.repositoryCampanha.CampanhaRepository;
import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;
import com.rpg.demo.campanhaParticipante.repositoryCampanhaPart.CampanhaPartRepository;
import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import com.rpg.demo.perfil.repositoryPerfil.PerfilRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCampanhaPartService {

    private final PerfilRepository perfilRepository;
    private final CampanhaRepository campanhaRepository;
    private final CampanhaPartRepository campanhaPartRepository;
    private final CreateCampanhaPartValidator createCampanhaPartValidator;
    private final CreateCampanhaPartMapper createCampanhaPartMapper;

    public CampanhaPartEntity criarCampanhaPart(CreateCampanhaPartDto campanhaPartDto) {
        createCampanhaPartValidator.validate(campanhaPartDto);

        PerfilEntity perfil = perfilRepository.findById(campanhaPartDto.getPerfilId())
                .orElseThrow(() -> new IllegalArgumentException("Perfil não encontrado"));

        CampanhaEntity campanha = campanhaRepository.findById(campanhaPartDto.getCampanhaId())
                .orElseThrow(() -> new IllegalArgumentException("Campanha não encontrada"));

        CampanhaPartEntity campanhaPart = createCampanhaPartMapper.toEntity(campanhaPartDto, perfil, campanha);
        return campanhaPartRepository.save(campanhaPart);
    }
}
