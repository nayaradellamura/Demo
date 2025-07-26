package com.rpg.demo.campanha.updateCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import org.springframework.stereotype.Component;

@Component
public class UpdateCampanhaValidator {

    public void validate(UpdateCampanhaDto campanhaDto, CampanhaEntity campanha) {
        if (campanhaDto.getNome() != null && campanhaDto.getNome().length() < 3) {
            throw new IllegalArgumentException("Nome muito curto");
        }
    }
}
