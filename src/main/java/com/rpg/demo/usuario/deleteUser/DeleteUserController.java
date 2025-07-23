package com.rpg.demo.usuario.deleteUser;

import com.rpg.demo.shared.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class DeleteUserController {

    private final DeleteUserService deleteUserService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDto<Void>> delete(@PathVariable Long id) {
        deleteUserService.delete(id);
        ResponseDto<Void> response = new ResponseDto<>("Usuário deletado com sucesso!", null);
        return ResponseEntity.ok(response);
    }
}
