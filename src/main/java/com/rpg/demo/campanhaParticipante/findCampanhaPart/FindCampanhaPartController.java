package com.rpg.demo.campanhaParticipante.findCampanhaPart;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campanha/participantes")
public class FindCampanhaPartController {

    private final FindCampanhaPartService findCampanhaPartService;

    public FindCampanhaPartController(FindCampanhaPartService service) { this.findCampanhaPartService = service; }

    @GetMapping("/find/{id}")
    public ResponseEntity<FindCampanhaPartDto> buscarPorId(@PathVariable Long id) {
        FindCampanhaPartDto findCampanhaPartDto = findCampanhaPartService.buscarPorId(id);
        return ResponseEntity.ok(findCampanhaPartDto);
    }

    @GetMapping("/find")
    public ResponseEntity<List<FindCampanhaPartDto>> buscarTodos() {
        List<FindCampanhaPartDto> campanhaPart = findCampanhaPartService.buscarTodos();
        return ResponseEntity.ok(campanhaPart);
    }

}
