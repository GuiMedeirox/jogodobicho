package com.bicho.jogodobicho.repository;

import com.bicho.jogodobicho.dto.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsuarioDTO, String> {
}
