package com.rpg.demo.perfil.createPerfil;

import com.rpg.demo.perfil.entity.PerfilEntity;
import com.rpg.demo.perfil.repository.PerfilRepository;
import com.rpg.demo.usuario.entity.UsuarioEntity;
import com.rpg.demo.usuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatePerfilService {

    private final UsuarioRepository usuarioRepository;
    private final PerfilRepository perfilRepository;
    private final CreatePerfilValidator createPerfilValidator;
    private final CreatePerfilMapper createPerfilMapper;

    public PerfilEntity criarPerfil(CreatePerfilDto perfilDto) {
        createPerfilValidator.validate(perfilDto);

        UsuarioEntity usuario = usuarioRepository.findById(perfilDto.getUsuarioId())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));

        PerfilEntity perfil = createPerfilMapper.toEntity(perfilDto, usuario);
        return perfilRepository.save(perfil);
    }
}
