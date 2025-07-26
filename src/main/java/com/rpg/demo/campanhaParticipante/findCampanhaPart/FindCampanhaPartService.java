package com.rpg.demo.campanhaParticipante.findCampanhaPart;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;
import com.rpg.demo.campanhaParticipante.repositoryCampanhaPart.CampanhaPartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCampanhaPartService {

    private final CampanhaPartRepository campanhaPartRepository;

    public FindCampanhaPartService(CampanhaPartRepository campanhaPartRepository) {
        this.campanhaPartRepository = campanhaPartRepository;
    }

    public FindCampanhaPartDto buscarPorId(Long id) {
        CampanhaPartEntity campanhaPart = campanhaPartRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Participante não encontrado"));

        return FindCampanhaPartMapper.toDto(campanhaPart);
    }

    public List<FindCampanhaPartDto> buscarTodos() {
        List<CampanhaPartEntity> campanhaPart = campanhaPartRepository.findAll();
        return FindCampanhaPartMapper.toDtoList(campanhaPart);
    }
}
