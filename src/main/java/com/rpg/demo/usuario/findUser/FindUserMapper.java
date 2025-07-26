package com.rpg.demo.usuario.findUser;

import com.rpg.demo.usuario.entityUser.UsuarioEntity;

import java.util.List;

public class FindUserMapper {

    public static FindUserDto toDto(UsuarioEntity usuario) {
        return new FindUserDto(
                usuario.getId().longValue(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }

    public static List<FindUserDto> toDtoList(List<UsuarioEntity> usuarios) {
        return usuarios.stream()
                .map(FindUserMapper::toDto)
                .toList();
    }
}
