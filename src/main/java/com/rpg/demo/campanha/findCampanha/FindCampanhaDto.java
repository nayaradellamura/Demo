package com.rpg.demo.campanha.findCampanha;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class FindCampanhaDto {

    private Long id;

    private String nome;

    private String descricao;

    private LocalDate data;

    private Long perfilId;
}
