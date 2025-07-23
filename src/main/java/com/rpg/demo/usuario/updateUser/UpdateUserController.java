package com.rpg.demo.usuario.updateUser;

import com.rpg.demo.shared.response.ResponseDto;
import com.rpg.demo.usuario.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UpdateUserController {

    @Autowired
    private UpdateUserService updateUserService;

    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDto<UsuarioEntity>> atualizar (@PathVariable Long id, @RequestBody UpdateUserDto userDto) {
        UsuarioEntity atualizado  = updateUserService.execute(id, userDto);
        ResponseDto<UsuarioEntity> response = new ResponseDto<>("Usuário atualizado com sucesso!", atualizado);
        return ResponseEntity.ok(response);
    }
}
