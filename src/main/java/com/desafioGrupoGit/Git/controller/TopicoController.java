package com.desafioGrupoGit.Git.controller;

import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
import com.desafioGrupoGit.Git.model.RespostaModel;
import com.desafioGrupoGit.Git.model.TopicoModel;
import com.desafioGrupoGit.Git.repository.TopicoRepository;
import com.desafioGrupoGit.Git.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping(path = "/topico")
    public ResponseEntity<List<TopicoModel>> buscarTodosTopicos(){
        return ResponseEntity.ok(topicoService.buscarTodos());
    }

    @GetMapping(path = "/topico/{id}")
    public Optional<TopicoModel> buscarTopicoPorId(@PathVariable Long id){
        return topicoService.buscarPorId(id);
    }
    @PostMapping(path = "topico")
    public ResponseEntity<TopicoModel> cadastrarTopico(@RequestBody TopicoModel topico){
        return ResponseEntity.ok(topicoService.cadastrar(topico));
    }
    @PutMapping(path = "/topico/{id}")
    public ResponseEntity<TopicoModel> alterarResposta(@RequestBody TopicoModel topico){
        return ResponseEntity.ok(topicoService.alterar(topico));
    }
    @DeleteMapping(path = "/topico/{id}")
    public void deletarResposta(@PathVariable Long id){
        topicoService.deletar(id);
    }

}
