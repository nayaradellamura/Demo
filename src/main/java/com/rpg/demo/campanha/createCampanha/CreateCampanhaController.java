package com.rpg.demo.campanha.createCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.shared.response.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campanha")
@AllArgsConstructor
public class CreateCampanhaController {

    private final CreateCampanhaService createCampanhaService;

    @PostMapping("/criar")
    public ResponseEntity<ResponseDto<CampanhaEntity>> criar(@RequestBody CreateCampanhaDto campanhaDto) {
        CampanhaEntity criado = createCampanhaService.criarCampanha(campanhaDto);
        ResponseDto<CampanhaEntity> response = new ResponseDto<>("Campanha criada com sucesso!", criado);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
