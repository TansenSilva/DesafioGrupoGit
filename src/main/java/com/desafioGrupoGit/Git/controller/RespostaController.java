package com.desafioGrupoGit.Git.controller;

import com.desafioGrupoGit.Git.model.RespostaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RespostaController {

    @Autowired
    private RespostaModel service;


}
