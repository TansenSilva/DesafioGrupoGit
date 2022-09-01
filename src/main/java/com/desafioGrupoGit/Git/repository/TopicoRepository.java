package com.desafioGrupoGit.Git.repository;
import com.desafioGrupoGit.Git.model.TopicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface TopicoRepository extends JpaRepository<TopicoModel, Long> {
}
