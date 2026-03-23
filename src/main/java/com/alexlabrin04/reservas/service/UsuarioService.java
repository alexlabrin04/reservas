package com.alexlabrin04.reservas.service;

import com.alexlabrin04.reservas.model.Rol;
import com.alexlabrin04.reservas.model.Usuario;
import com.alexlabrin04.reservas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    public Usuario registrarUsuario(Usuario usuario){
        if(usuarioRepository.existsByEmail(usuario.getEmail())){
            throw new RuntimeException("El email ya está registrado.");
        }
        usuario.setRol(Rol.USER);
        return usuarioRepository.save(usuario);
    }
}