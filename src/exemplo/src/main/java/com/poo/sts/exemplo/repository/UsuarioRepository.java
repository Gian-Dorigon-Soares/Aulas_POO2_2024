package com.poo.sts.exemplo.repository;

import com.poo.sts.exemplo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
