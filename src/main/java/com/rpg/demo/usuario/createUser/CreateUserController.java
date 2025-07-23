package com.rpg.demo.usuario.createUser;

import com.rpg.demo.shared.response.ResponseDto;
import com.rpg.demo.usuario.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class CreateUserController {

    @Autowired
    private CreateUserService createUserService;

    @PostMapping("/criar")
    public ResponseEntity<ResponseDto<UsuarioEntity>> criar(@RequestBody CreateUserDto userDto) {
        UsuarioEntity criado = createUserService.criarUsuario(userDto);
        ResponseDto<UsuarioEntity> response = new ResponseDto<>("Usuário cadastrado com sucesso!", criado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
