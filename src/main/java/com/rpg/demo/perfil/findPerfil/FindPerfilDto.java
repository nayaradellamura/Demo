package com.rpg.demo.perfil.findPerfil;

public class FindPerfilDto {

    private Long id;

    private Long usuarioId;

    private String tipo;

    public FindPerfilDto(Long id, Long usuarioId, String tipo) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.tipo = tipo;
    }
}
