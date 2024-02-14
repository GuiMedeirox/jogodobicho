package com.bicho.jogodobicho.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "sorteio")
public class Aposta {

    @Id
    @Column(name = "data", nullable = false, unique = true)
    private LocalDate data;
    @Column(name = "numeroGrupo", nullable = false)
    private Integer numeroGrupo;
    @Column(name = "numeroMilhar", nullable = false)
    private Integer numeroMilhar;

    @CreationTimestamp
    @Column(name = "registradoEm", nullable = false, updatable = false)
    private LocalDateTime registradoEm;

    @UpdateTimestamp
    @Column(name = "editadoEm", nullable = false)
    private LocalDateTime editadoEm;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public Integer getNumeroMilhar() {
        return numeroMilhar;
    }

    public void setNumeroMilhar(Integer numeroMilhar) {
        this.numeroMilhar = numeroMilhar;
    }

    public LocalDateTime getRegistradoEm() {
        return registradoEm;
    }

    public void setRegistradoEm(LocalDateTime registradoEm) {
        this.registradoEm = registradoEm;
    }

    public LocalDateTime getEditadoEm() {
        return editadoEm;
    }

    public void setEditadoEm(LocalDateTime editadoEm) {
        this.editadoEm = editadoEm;
    }



    public Aposta(LocalDate data, Integer numeroGrupo, Integer numeroMilhar, LocalDateTime registradoEm, LocalDateTime editadoEm) {
        this.data = data;
        this.numeroGrupo = numeroGrupo;
        this.numeroMilhar = numeroMilhar;
        this.registradoEm = registradoEm;
        this.editadoEm = editadoEm;
    }

    public Aposta() {
    }

}
