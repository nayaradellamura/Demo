package com.rpg.demo.usuario.createUser;

import com.rpg.demo.usuario.entityUser.UsuarioEntity;

public class CreateUserMapper {

    public static UsuarioEntity toEntity(CreateUserDto userDto){
        UsuarioEntity usuario =  new UsuarioEntity();
        usuario.setNome(userDto.getNome());
        usuario.setEmail(userDto.getEmail());
        usuario.setSenha(userDto.getSenha());
        return usuario;
    }
}
