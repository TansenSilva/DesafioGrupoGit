package com.desafioGrupoGit.Git.repository;

import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
import com.desafioGrupoGit.Git.model.RespostaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRespostaRepository extends JpaRepository<RespostaModel,Long> {
    List<RespostaModel> findByStatus(StatusTopico status);

}
