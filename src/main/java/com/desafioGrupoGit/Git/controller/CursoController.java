package com.desafioGrupoGit.Git.controller;

import com.desafioGrupoGit.Git.model.CursoModel;
import com.desafioGrupoGit.Git.model.Enum.Categorias;
import com.desafioGrupoGit.Git.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController {

    @Autowired

    private CursoService service;

    @GetMapping (path = "/cursos")
    public List<CursoModel> buscarCursos(){
        return service.buscarCursos();
    }

    @GetMapping (path = "/cursos/{idCurso/")
    public Optional<CursoModel> bucarCursosPorId (@PathVariable Long idCurso){
        return service.buscarCursoPorId(idCurso);
    }

    @PostMapping(path = "/cursos")
    public CursoModel cadastrarCurso(@RequestBody CursoModel cursoModel){
        return service.cadastrarCurso(cursoModel);
    }

    @GetMapping(path = "/cursos/categorias/{caterogias}")
    public List<CursoModel> buscaPorCategoria(@PathVariable Categorias categorias){
        return service.buscarPorCategoria(categorias);
    }


}
