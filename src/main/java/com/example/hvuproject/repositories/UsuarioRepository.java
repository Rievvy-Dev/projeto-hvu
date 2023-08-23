package com.example.hvuproject.repositories;

import com.example.hvuproject.models.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);

}
