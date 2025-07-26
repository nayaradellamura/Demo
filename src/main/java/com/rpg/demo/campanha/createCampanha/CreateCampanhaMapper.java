package com.rpg.demo.campanha.createCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import org.springframework.stereotype.Component;

@Component
public class CreateCampanhaMapper {

    public static CampanhaEntity toEntity(CreateCampanhaDto campanhaDto, PerfilEntity perfil) {
        CampanhaEntity campanha = new CampanhaEntity();
        campanha.setNome(campanhaDto.getNome());
        campanha.setDescricao(campanhaDto.getDescricao());
        campanha.setData(campanhaDto.getData());
        campanha.setPerfil(perfil);
        return campanha;
    }
}
