package com.rpg.demo.campanhaParticipante.entityCampanhaPart;

import com.rpg.demo.campanha.entityCampanha.CampanhaEntity;
import com.rpg.demo.perfil.entityPerfil.PerfilEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@Table(name = "campanha_participante")
public class CampanhaPartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private PerfilEntity perfil;

    @ManyToOne
    @JoinColumn(name = "campanha_id", nullable = false)
    private CampanhaEntity campanha;
}
