package com.desafioGrupoGit.Git.service;

import com.desafioGrupoGit.Git.controller.CursoController;
import com.desafioGrupoGit.Git.model.CursoModel;
import com.desafioGrupoGit.Git.model.Enum.Categorias;
import com.desafioGrupoGit.Git.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired

    private ICursoRepository repository;

    public List<CursoModel> buscarCursos(){
        return repository.findAll();
    }

    public Optional<CursoModel> buscarCursoPorId(Long idCurso){
        return repository.findById(idCurso);
    }

    public CursoModel cadastrarCurso (CursoModel curso){
        return repository.save(curso);
    }

    public List<CursoModel> buscarPorCategoria (Categorias categorias){
        return repository.findByCategoria(categorias);

}
