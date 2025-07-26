package com.rpg.demo.campanhaParticipante.deleteCampanhaPart;

import com.rpg.demo.campanhaParticipante.repositoryCampanhaPart.CampanhaPartRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCampanhaPartService {

    private final CampanhaPartRepository campanhaPartRepository;

    public void delete(Long id) {
        if (!campanhaPartRepository.existsById(id)){
            throw new EntityNotFoundException("Participante não encontrado");
        }
        campanhaPartRepository.deleteById(id);
    }
}
