package com.desafioGrupoGit.Git.repository;

import com.desafioGrupoGit.Git.model.CursoModel;
import com.desafioGrupoGit.Git.model.Enum.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<CursoModel, Long> {


    List<CursoModel> findByCategoria(Categorias categorias);
}
