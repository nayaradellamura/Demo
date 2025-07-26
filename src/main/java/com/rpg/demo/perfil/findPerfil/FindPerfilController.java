package com.rpg.demo.perfil.findPerfil;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class FindPerfilController {

    private final FindPerfilService findPerfilService;

    public FindPerfilController(FindPerfilService service) { this.findPerfilService = service; }

    @GetMapping("/find/{id}")
    public ResponseEntity<FindPerfilDto> buscarPorId(@PathVariable Long id) {
        FindPerfilDto findPerfilDto = findPerfilService.buscarPorId(id);
        return ResponseEntity.ok(findPerfilDto);
    }

    @GetMapping("/find")
    public ResponseEntity<List<FindPerfilDto>> buscarTodos() {
        List<FindPerfilDto> perfil = findPerfilService.buscarTodos();
        return ResponseEntity.ok(perfil);
    }
}
