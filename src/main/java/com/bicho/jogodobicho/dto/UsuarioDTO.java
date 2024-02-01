package com.bicho.jogodobicho.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String nome;
    private String email;
}
