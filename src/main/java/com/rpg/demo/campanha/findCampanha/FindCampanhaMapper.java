package com.rpg.demo.campanha.findCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;

import java.util.List;

public class FindCampanhaMapper {

    public static FindCampanhaDto toDto (CampanhaEntity campanha) {
        return new FindCampanhaDto(
                campanha.getId().longValue(),
                campanha.getNome(),
                campanha.getDescricao(),
                campanha.getData(),
                campanha.getPerfil().getId().longValue()
        );
    }

    public static List<FindCampanhaDto> toDtoList(List<CampanhaEntity> campanha) {
        return campanha.stream()
                .map(FindCampanhaMapper::toDto)
                .toList();
    }
}
