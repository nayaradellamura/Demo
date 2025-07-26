package com.rpg.demo.usuario.findUser;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class FindUserController {

    private final FindUserService findUserService;

    public FindUserController(FindUserService service) {
        this.findUserService = service;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<FindUserDto> buscarPorId(@PathVariable Long id) {
        FindUserDto findUserDto = findUserService.buscarPorId(id);
        return ResponseEntity.ok(findUserDto);
    }

    @GetMapping("/find")
    public ResponseEntity<List<FindUserDto>> buscarTodos() {
        List<FindUserDto> usuarios = findUserService.buscarTodos();
        return ResponseEntity.ok(usuarios);
    }

}
