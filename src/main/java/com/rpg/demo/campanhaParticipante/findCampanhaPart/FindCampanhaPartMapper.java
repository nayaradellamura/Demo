package com.rpg.demo.campanhaParticipante.findCampanhaPart;

import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;

import java.util.List;

public class FindCampanhaPartMapper {

    public static FindCampanhaPartDto toDto (CampanhaPartEntity campanhaPart) {
        return new FindCampanhaPartDto(
                campanhaPart.getId().longValue(),
                campanhaPart.getPerfil().getId().longValue(),
                campanhaPart.getCampanha().getId().longValue()
        );
    }

    public static List<FindCampanhaPartDto> toDtoList(List<CampanhaPartEntity> campanhaPart) {
        return campanhaPart.stream()
                .map(FindCampanhaPartMapper::toDto)
                .toList();
    }
}
