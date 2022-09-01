package com.desafioGrupoGit.Git.repository;

import com.desafioGrupoGit.Git.model.UsuárioModel;
import org.hibernate.boot.JaccPermissionDefinition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<UsuárioModel, Long> {


}