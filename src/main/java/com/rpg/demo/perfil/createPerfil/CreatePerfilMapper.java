package com.rpg.demo.perfil.createPerfil;

import com.rpg.demo.perfil.entity.PerfilEntity;
import com.rpg.demo.perfil.enums.TipoPerfil;
import com.rpg.demo.usuario.createUser.CreateUserDto;
import com.rpg.demo.usuario.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class CreatePerfilMapper {

    public static PerfilEntity toEntity(CreatePerfilDto perfilDto, UsuarioEntity usuario) {
        PerfilEntity perfil = new PerfilEntity();
        perfil.setTipo(TipoPerfil.fromString(perfilDto.getTipo()));
        perfil.setUsuario(usuario);
        return perfil;
    }
}
