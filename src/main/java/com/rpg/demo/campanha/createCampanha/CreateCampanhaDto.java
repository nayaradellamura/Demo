package com.rpg.demo.campanha.createCampanha;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CreateCampanhaDto {

    private Long id;

    private String nome;

    private String descricao;

    private LocalDate data;

    private Long perfilId;

}
