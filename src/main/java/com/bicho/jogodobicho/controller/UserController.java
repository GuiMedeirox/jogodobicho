package com.bicho.jogodobicho.controller;

import com.bicho.jogodobicho.dto.UsuarioCreationDTO;
import com.bicho.jogodobicho.dto.UsuarioDTO;
import com.bicho.jogodobicho.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UsuarioService userService;

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioCreationDTO criarUsuario(@RequestBody UsuarioCreationDTO user){
        return userService.criar(user);
    }
    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioDTO> listarUsuarios(){
        return userService.obterTodos();
    }

    @GetMapping("/usuario/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<UsuarioDTO> listarUsuarioPorCpf(@PathVariable(value="cpf") String cpf){
        return userService.obterPorCpf(cpf);
    }


}