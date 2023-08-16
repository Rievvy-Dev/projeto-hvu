package com.example.hvuproject.controllers;

import com.example.hvuproject.dto.UsuarioDTO;
import com.example.hvuproject.models.usuario.Usuario;
import com.example.hvuproject.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> salvar(@RequestBody @Valid UsuarioDTO usuarioDTO ) {

        if(usuarioService.existsByCpf(usuarioDTO.getCpf())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: CPF já está cadastrado");
        }
        if(usuarioService.existsByEmail(usuarioDTO.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: E-mail já está cadastrado");
        }

        var usuarioModel = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuarioModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuarioModel));
    }
}
