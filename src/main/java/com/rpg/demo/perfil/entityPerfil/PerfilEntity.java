package com.rpg.demo.perfil.entityPerfil;

import com.rpg.demo.perfil.enums.TipoPerfil;
import com.rpg.demo.usuario.entityUser.UsuarioEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "perfil")
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPerfil tipo;

}
