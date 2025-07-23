package com.rpg.demo.usuario.findUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindUserDto {

    private Long id;
    private String nome;
    private String email;
}
