package com.rpg.demo.perfil.createPerfil;

import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import com.rpg.demo.perfil.enums.TipoPerfil;
import com.rpg.demo.usuario.entityUser.UsuarioEntity;
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
