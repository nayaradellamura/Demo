package com.rpg.demo.campanha.deleteCampanha;

import com.rpg.demo.campanha.repositoryCampanha.CampanhaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCampanhaService {

    private final CampanhaRepository campanhaRepository;

    public void delete(Long id) {
        if (!campanhaRepository.existsById(id)){
            throw new EntityNotFoundException("Campanha não encontrada");
        }
        campanhaRepository.deleteById(id);
    }
}
