package com.desafioGrupoGit.Git.service;
import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
import com.desafioGrupoGit.Git.model.RespostaModel;
import com.desafioGrupoGit.Git.model.TopicoModel;
import com.desafioGrupoGit.Git.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;

    public List <TopicoModel> buscarTodos(){
        return topicoRepository.findAll();
    }
    public Optional<TopicoModel> buscarPorId(Long id){
        return topicoRepository.findById(id);
    }
    public TopicoModel cadastrar(TopicoModel topico){
        topico.setDataCriacao(LocalDateTime.now());

        return topicoRepository.save(topico);
    }
    public TopicoModel alterar(TopicoModel topico){
        return topicoRepository.save(topico);
    }
    public void deletar(Long id){
        topicoRepository.deleteById(id);
    }
}







