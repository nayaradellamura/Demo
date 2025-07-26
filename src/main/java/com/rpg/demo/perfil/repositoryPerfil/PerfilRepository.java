package com.rpg.demo.perfil.repositoryPerfil;

import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
