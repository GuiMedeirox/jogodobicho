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
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioCreationDTO criarUsuario(@RequestBody UsuarioCreationDTO user){
        return usuarioService.criar(user);
    }
    @GetMapping("/usuario")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioDTO> listarUsuarios(){
        return usuarioService.obterTodos();
    }

    @GetMapping("/usuario/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<UsuarioDTO> listarUsuarioPorCpf(@PathVariable(value="cpf") String cpf){
        return usuarioService.obterPorCpf(cpf);
    }

    @PutMapping("/usuario/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDTO editarUsuario(@PathVariable(value="cpf") String cpf, @RequestBody UsuarioDTO usuario){
        return usuarioService.editar(cpf, usuario);
    }


    @DeleteMapping("/usuario/{cpf}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarUsuario(@PathVariable(value="cpf") String cpf){
        usuarioService.deletar(cpf);
    }
}