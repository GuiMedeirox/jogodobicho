package com.bicho.jogodobicho.repository;

import com.bicho.jogodobicho.dto.UsuarioDTO;
import com.bicho.jogodobicho.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    @Query("SELECT u FROM Usuario u WHERE u.cpf = :cpf")
    Optional<Usuario> findByCpf(@Param("cpf") String cpf);

}
