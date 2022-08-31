package com.desafioGrupoGit.Git.repository;

import com.desafioGrupoGit.Git.model.RespostaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RespostaRepository implements JpaRepository<RespostaModel,Long> {
}
