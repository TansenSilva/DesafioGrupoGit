package com.desafioGrupoGit.Git.controller;

import com.desafioGrupoGit.Git.model.UsuárioModel;
import com.desafioGrupoGit.Git.repository.IUsuarioRepository;
import com.desafioGrupoGit.Git.service.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioServices usuarioServices;
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @PostMapping(path = "/usuario")
    public UsuárioModel cadastrarusuario(@RequestBody UsuárioModel usuárioModel) {
        return usuarioServices.cadastrarUsuario(usuárioModel);
    }
    @DeleteMapping(path = "/usuario/{id}")
    public void deletarUsuario(@PathVariable long id) {
usuarioServices.deletarUsuario(id);
    }
}
