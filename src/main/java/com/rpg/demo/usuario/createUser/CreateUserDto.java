package com.rpg.demo.usuario.createUser;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {

    private Integer id;

    private String nome;

    private String email;

    private String senha;
}
