package com.desafioGrupoGit.Git.service;
import com.desafioGrupoGit.Git.model.TopicoModel;
import com.desafioGrupoGit.Git.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;
}







