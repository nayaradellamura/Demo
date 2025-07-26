package com.rpg.demo.campanhaParticipante.createCampanhaPart;

import com.rpg.demo.campanha.createCampanha.CreateCampanhaService;
import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;
import com.rpg.demo.campanhaParticipante.repositoryCampanhaPart.CampanhaPartRepository;
import com.rpg.demo.shared.response.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("campanha/participantes")
@AllArgsConstructor
public class CreateCampanhaPartController {

    private final CreateCampanhaPartService createCampanhaPartService;

    @PostMapping("/criar")
    public ResponseEntity<ResponseDto<CampanhaPartEntity>> criar(@RequestBody CreateCampanhaPartDto campanhaPartDto) {
        CampanhaPartEntity criado = createCampanhaPartService.criarCampanhaPart(campanhaPartDto);
        ResponseDto<CampanhaPartEntity> response = new ResponseDto<>("Participantes adicionado na campanha com sucesso!", criado);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
