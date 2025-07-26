package com.rpg.demo.campanha.updateCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.usuario.updateUser.UpdateUserDto;

public class UpdateCampanhaMapper {

    public static void updateEntity(CampanhaEntity campanha, UpdateCampanhaDto campanhaDto) {
        if (campanhaDto.getNome() != null) {
            campanha.setNome(campanhaDto.getNome());
        }

        if (campanhaDto.getDescricao() != null) {
            campanha.setDescricao(campanhaDto.getDescricao());
        }

        if (campanhaDto.getData() != null) {
            campanha.setData(campanhaDto.getData());
        }
    }
}
