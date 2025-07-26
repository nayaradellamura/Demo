package com.rpg.demo.campanha.deleteCampanha;

import com.rpg.demo.perfil.deletePerfil.DeletePerfilService;
import com.rpg.demo.shared.response.ResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campanha")
@AllArgsConstructor
public class DeleteCampanhaController {

    private final DeleteCampanhaService deleteCampanhaService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto<Void>> delete(@PathVariable Long id) {
        deleteCampanhaService.delete(id);
        ResponseDto<Void> response = new ResponseDto<>("Campanha deletada com sucesso", null);
        return ResponseEntity.ok(response);
    }
}
