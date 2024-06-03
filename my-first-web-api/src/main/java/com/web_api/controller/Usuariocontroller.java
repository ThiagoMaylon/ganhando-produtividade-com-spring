package com.web_api.controller;

import com.web_api.model.Usuario;
import com.web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Usuariocontroller {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getUsers(){
        return usuarioRepository.listAll();
    }

    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable("id") Integer id){
        return usuarioRepository.finById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUsusario(@PathVariable("id") Integer id){
        usuarioRepository.remove(id);
    }

    @PutMapping("/update/{usuario}")
    public void updateUsuario(@PathVariable("usuario") Usuario usuario){
        usuarioRepository.update(usuario);
    }

    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
