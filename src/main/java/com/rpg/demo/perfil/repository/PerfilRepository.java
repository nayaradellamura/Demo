package com.rpg.demo.perfil.repository;

import com.rpg.demo.perfil.entity.PerfilEntity;
import com.rpg.demo.usuario.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
