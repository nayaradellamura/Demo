package com.rpg.demo.usuario.updateUser;

import com.rpg.demo.usuario.entity.UsuarioEntity;

public class UpdateUserMapper {

    public static void updateEntity(UsuarioEntity usuario, UpdateUserDto userDto) {
        if (userDto.getNome() != null) {
            usuario.setNome(userDto.getNome());
        }
        if (userDto.getSenha() != null) {
            usuario.setSenha(userDto.getSenha());
        }
    }
}
