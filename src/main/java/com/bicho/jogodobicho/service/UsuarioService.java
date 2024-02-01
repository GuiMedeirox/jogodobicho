package com.bicho.jogodobicho.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bicho.jogodobicho.dto.UsuarioCreationDTO;
import com.bicho.jogodobicho.dto.UsuarioDTO;
import com.bicho.jogodobicho.model.Usuario;
import com.bicho.jogodobicho.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<UsuarioDTO> obterTodos(){
        List<Usuario> listaUsuarios = usuarioRepository.findAll();
        return listaUsuarios.stream().map(usuario -> new ModelMapper().map(usuario, UsuarioDTO.class)).collect(Collectors.toList());

    }
    public Optional<UsuarioDTO> obterPorCpf(String cpf){
        Optional<Usuario> usuario = usuarioRepository.findByCpf(cpf);
        if(!usuario.isEmpty()){
            UsuarioDTO userDTO = new ModelMapper().map(usuario.get(), UsuarioDTO.class);
            return Optional.of(userDTO);
        }
        return null;
    }

    public UsuarioCreationDTO criar(UsuarioCreationDTO user){
        ModelMapper mapper = new ModelMapper();
        Usuario usuario = mapper.map(user, Usuario.class);
        usuarioRepository.save(usuario);
        return user;
    }

    public UsuarioDTO editar(String cpf, UsuarioDTO user){
        Optional<Usuario> novoUsuario = usuarioRepository.findByCpf(cpf);
        ModelMapper mapper = new ModelMapper();
        if(!novoUsuario.isEmpty()){
            novoUsuario.get().setNome(user.getNome());
            novoUsuario.get().setEmail(user.getEmail());
            usuarioRepository.save(novoUsuario.get());
        }
        return mapper.map(novoUsuario.get(), UsuarioDTO.class);
    }

    public void deletar(String cpf){
        Optional<Usuario> usuario = usuarioRepository.findByCpf(cpf);
        if(!usuario.isEmpty()){
            usuarioRepository.delete(usuario.get());
        }

    }

}