package com.rpg.demo.perfil.deletePerfil;

import com.rpg.demo.shared.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
@RequiredArgsConstructor
public class DeletePerfilController {

    private final DeletePerfilService deletePerfilService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto<Void>> delete(@PathVariable Long id) {
        deletePerfilService.delete(id);
        ResponseDto<Void> response = new ResponseDto<>("Perfil deletado com sucesso", null);
        return ResponseEntity.ok(response);
    }
}
