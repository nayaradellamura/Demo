package com.rpg.demo.campanha.findCampanha;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campanha")
public class FindCampanhaController {

    private final FindCampanhaService findCampanhaService;

    public FindCampanhaController(FindCampanhaService service) { this.findCampanhaService = service; }

    @GetMapping("/find/{id}")
    public ResponseEntity<FindCampanhaDto> buscarPorId(@PathVariable Long id) {
        FindCampanhaDto findCampanhaDto = findCampanhaService.buscarPorId(id);
        return  ResponseEntity.ok(findCampanhaDto);
    }

    @GetMapping("/find")
    public ResponseEntity<List<FindCampanhaDto>> buscarTodos() {
        List<FindCampanhaDto> campanha = findCampanhaService.buscarTodos();
        return ResponseEntity.ok(campanha);
    }
}
