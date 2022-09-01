package com.desafioGrupoGit.Git.service;

import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
import com.desafioGrupoGit.Git.model.RespostaModel;
import com.desafioGrupoGit.Git.repository.IRespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespostaService {
    @Autowired
    private IRespostaRepository repository;

    public List <RespostaModel> buscarTodos(){
       return repository.findAll();
    }
    public List<RespostaModel> buscarPorStatus(StatusTopico status){
        return repository.findByStatus(status);
    }
    public Optional<RespostaModel> buscarPorId(Long id){
        return repository.findById(id);
    }
    public RespostaModel cadastrar(RespostaModel resposta){
        return repository.save(resposta);
    }
    public RespostaModel alterar(RespostaModel resposta){
        return repository.save(resposta);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }

}
