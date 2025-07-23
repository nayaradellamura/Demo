package com.rpg.demo.perfil.findPerfil;

import com.rpg.demo.perfil.entity.PerfilEntity;
import com.rpg.demo.usuario.findUser.FindUserDto;

public class FindPerfilMapper {

    public static FindPerfilDto toDto (PerfilEntity perfil){
        return new FindPerfilDto(
                perfil.getId().longValue(),
                perfil.getUsuario().getId().longValue(),
                perfil.getTipo().name()
        );
    }
}
