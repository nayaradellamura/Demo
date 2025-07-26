package com.rpg.demo.campanha.updateCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanha.repositoryCampanha.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateCampanhaService {

    @Autowired
    private CampanhaRepository campanhaRepository;

    @Autowired
    private UpdateCampanhaValidator updateCampanhaValidator;

    public CampanhaEntity execute(long id, UpdateCampanhaDto campanhaDto) {
        CampanhaEntity campanha = campanhaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Campanha não encontrada"));

        updateCampanhaValidator.validate(campanhaDto, campanha);
        UpdateCampanhaMapper.updateEntity(campanha, campanhaDto);

        return campanhaRepository.save(campanha);
    }
}
