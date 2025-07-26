package com.rpg.demo.campanha.findCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.campanha.repositoryCampanha.CampanhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCampanhaService {

    private final CampanhaRepository campanhaRepository;

    public FindCampanhaService(CampanhaRepository campanhaRepository) { this.campanhaRepository = campanhaRepository; }

    public FindCampanhaDto buscarPorId(Long id) {
        CampanhaEntity campanha = campanhaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Campanha não encontrada"));

        return FindCampanhaMapper.toDto(campanha);
    }

    public List<FindCampanhaDto> buscarTodos() {
        List<CampanhaEntity> campanha = campanhaRepository.findAll();
        return FindCampanhaMapper.toDtoList(campanha);
    }
}
