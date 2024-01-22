package com.bicho.jogodobicho.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sorteio")
public class Sorteio {

    @Id
    @Column(name = "data", nullable = false, unique = true)
    private LocalDate data;
    @Column(name = "numeroGrupo", nullable = false)
    private Integer numeroGrupo;
    @Column(name = "numeroDezena", nullable = false)
    private Integer numeroDezena;

    @CreationTimestamp
    @Column(name = "registradoEm", nullable = false, updatable = false)
    private LocalDateTime registradoEm;

    @UpdateTimestamp
    @Column(name = "editadoEm", nullable = false)
    private LocalDateTime editadoEm;
}
