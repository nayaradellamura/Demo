package com.rpg.demo.campanha.updateCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.shared.response.ResponseDto;
import com.rpg.demo.usuario.updateUser.UpdateUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campanha")
@AllArgsConstructor
public class UpdateCampanhaController {

    @Autowired
    private UpdateCampanhaService updateCampanhaService;

    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDto<CampanhaEntity>> atualizar (@PathVariable Long id, @RequestBody UpdateCampanhaDto campanhaDto) {
        CampanhaEntity atualizado = updateCampanhaService.execute(id, campanhaDto);
        ResponseDto<CampanhaEntity> response = new ResponseDto<>("Campanha atualizada com sucesso!", atualizado);
        return ResponseEntity.ok(response);
    }
}
