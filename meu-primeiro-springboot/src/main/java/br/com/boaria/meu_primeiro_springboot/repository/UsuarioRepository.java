package br.com.boaria.meu_primeiro_springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boaria.meu_primeiro_springboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsername(String username);
    
}
