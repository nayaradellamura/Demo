package com.rpg.demo.campanhaParticipante.repositoryCampanhaPart;

import com.rpg.demo.campanhaParticipante.entityCampanhaPart.CampanhaPartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampanhaPartRepository extends JpaRepository<CampanhaPartEntity, Long> {
}
