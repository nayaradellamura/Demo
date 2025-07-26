package com.rpg.demo.campanhaParticipante.deleteCampanhaPart;

import com.rpg.demo.shared.response.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("campanha/participantes")
@AllArgsConstructor
public class DeleteCampanhaPartController {

    private final DeleteCampanhaPartService deleteCampanhaPartService;

    @DeleteMapping("delete/{id}")
    public ResponseEntity<ResponseDto<Void>> delete(@PathVariable Long id) {
        deleteCampanhaPartService.delete(id);
        ResponseDto<Void> response = new ResponseDto<>("Participante deletado com sucesso", null);
        return ResponseEntity.ok(response);
    }
}
