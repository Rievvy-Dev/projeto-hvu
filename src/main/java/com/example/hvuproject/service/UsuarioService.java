package com.example.hvuproject.service;

import com.example.hvuproject.models.usuario.Usuario;
import com.example.hvuproject.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class UsuarioService {

    private Logger logger = Logger.getLogger(UsuarioService.class.getName());
    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar (Usuario usuario) {
        logger.info("Criando usuario");

        return usuarioRepository.save(usuario);
    }

    @Transactional
    public void deletar (Usuario usuario) {
        logger.info("Deletando usuário");

        usuarioRepository.delete(usuario);
    }

    public boolean existsByCpf(String cpf) {
        logger.info("Buscando por cpf");

        return usuarioRepository.existsByCpf(cpf);
    }

    public boolean existsByEmail(String email) {
        logger.info("Buscando por email");

        return usuarioRepository.existsByEmail(email);
    }
}
