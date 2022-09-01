package com.desafioGrupoGit.Git.service;

import com.desafioGrupoGit.Git.model.UsuárioModel;
import com.desafioGrupoGit.Git.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServices {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    public UsuárioModel cadastrarUsuario(UsuárioModel usuárioModel) {
        usuárioModel.getNome();
        usuárioModel.getSenha();
        usuárioModel.getEmail();
        return usuarioRepository.save(usuárioModel);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
