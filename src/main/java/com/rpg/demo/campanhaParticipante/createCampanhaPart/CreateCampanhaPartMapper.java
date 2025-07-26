package com.rpg.demo.campanhaParticipante.createCampanhaPart;

import com.rpg.demo.campanha.createCampanha.CreateCampanhaDto;
import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;
import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import org.springframework.stereotype.Component;

@Component
public class CreateCampanhaPartMapper {

    public static CampanhaPartEntity toEntity(CreateCampanhaPartDto campanhaPartDto, PerfilEntity perfil, CampanhaEntity campanha) {
        CampanhaPartEntity campanhaPart = new CampanhaPartEntity();
        campanhaPart.setPerfil(perfil);
        campanhaPart.setCampanha(campanha);
        return campanhaPart;
    }
}
