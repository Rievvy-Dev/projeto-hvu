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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findUser(@PathVariable(value = "id") Long id) {
        Optional<Usuario> usuarioModelOptional = usuarioService.findById(id);
        if(!usuarioModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuarioModelOptional.get());
    }
//    @GetMapping
//    public ResponseEntity<Usuario> findUser(Optional<Long> id, Optional<String> cpf) {
//        if(id.isPresent()) {
//            return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findById(id));
//        } else if ()
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario não encontrado");
//    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id) {
        Optional<Usuario> usuarioOptional = usuarioService.findById((id));
        if(!usuarioOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuaruio não encontrado");
        }
        usuarioService.delete(usuarioOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado com sucesso");
    }
}
