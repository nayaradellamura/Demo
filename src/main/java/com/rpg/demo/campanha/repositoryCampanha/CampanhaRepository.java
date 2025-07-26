package com.rpg.demo.campanha.repositoryCampanha;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaRepository extends JpaRepository<CampanhaEntity, Long> {
}
