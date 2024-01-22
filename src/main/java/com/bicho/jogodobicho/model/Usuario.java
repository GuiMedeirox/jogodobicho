package com.bicho.jogodobicho.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @Column(name="cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name="nome", nullable = false)
    private String nome;
    @Column(name="email", nullable = false)
    private String email;

    @CreationTimestamp
    @Column(name = "registradoEm", nullable = false, updatable = false)
    private LocalDateTime registradoEm;

    @UpdateTimestamp
    @Column(name = "editadoEm", nullable = false)
    private LocalDateTime editadoEm;

}
