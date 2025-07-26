package com.rpg.demo.campanhaParticipante.findCampanhaPart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindCampanhaPartDto {

    private Long id;

    private Long perfilId;

    private Long campanhaId;
}
