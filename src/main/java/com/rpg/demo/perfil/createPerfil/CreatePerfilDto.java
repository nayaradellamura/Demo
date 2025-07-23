package com.rpg.demo.perfil.createPerfil;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePerfilDto {

    private Long id;

    private Long usuarioId;

    private String tipo;
}
