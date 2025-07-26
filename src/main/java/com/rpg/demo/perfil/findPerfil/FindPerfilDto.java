package com.rpg.demo.perfil.findPerfil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindPerfilDto {

    private Long id;

    private Long usuarioId;

    private String tipo;
}
