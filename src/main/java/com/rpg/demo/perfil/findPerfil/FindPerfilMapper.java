package com.rpg.demo.perfil.findPerfil;

import com.rpg.demo.perfil.entityPerfil.PerfilEntity;

import java.util.List;

public class FindPerfilMapper {

    public static FindPerfilDto toDto (PerfilEntity perfil){
        return new FindPerfilDto(
                perfil.getId().longValue(),
                perfil.getUsuario().getId().longValue(),
                perfil.getTipo().name()
        );
    }

    public static List<FindPerfilDto> toDtoList(List<PerfilEntity> perfil) {
        return perfil.stream()
                .map(FindPerfilMapper::toDto)
                .toList();
    }
}
