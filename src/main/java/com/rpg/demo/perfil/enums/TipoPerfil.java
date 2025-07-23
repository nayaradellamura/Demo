package com.rpg.demo.perfil.enums;

import java.util.Arrays;

public enum TipoPerfil {
    JOGADOR,
    MESTRE;

    public static TipoPerfil fromString(String tipo) {
        return Arrays.stream(values())
                .filter(t -> t.name().equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de perfil inválido: " + tipo));
    }
}
