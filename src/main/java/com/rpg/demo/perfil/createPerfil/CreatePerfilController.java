package com.rpg.demo.perfil.createPerfil;

import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import com.rpg.demo.shared.response.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
@AllArgsConstructor
public class CreatePerfilController {

    private final CreatePerfilService createPerfilService;

    @PostMapping("/criar")
    public ResponseEntity<ResponseDto<PerfilEntity>> criar(@RequestBody CreatePerfilDto perfilDto) {
        PerfilEntity criado = createPerfilService.criarPerfil(perfilDto);
        ResponseDto<PerfilEntity> response = new ResponseDto<>("Perfil cadastrado com sucesso!", criado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
