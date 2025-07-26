package com.rpg.demo.campanha.updateCampanha;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UpdateCampanhaDto {

    private String nome;

    private String descricao;

    private LocalDate data;
}
