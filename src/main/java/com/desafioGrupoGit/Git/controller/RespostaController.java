package com.desafioGrupoGit.Git.controller;

import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
import com.desafioGrupoGit.Git.model.RespostaModel;
import com.desafioGrupoGit.Git.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RespostaController {

    @Autowired
    private RespostaService service;

    @GetMapping(path = "/resposta")
    public ResponseEntity<List<RespostaModel>>buscarTodasRespostas(){
        return ResponseEntity.ok(service.buscarTodos());
    }
    @GetMapping(path = "/resposta/status/{status}")
    public ResponseEntity<List<RespostaModel>>buscarPorStatus(StatusTopico status){
        return ResponseEntity.ok(service.buscarPorStatus(status));
    }
    @GetMapping(path = "/resposta/{id}")
    public Optional<RespostaModel> buscarRespostaPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
    @PostMapping(path = "/resposta")
    public ResponseEntity<RespostaModel> cadastrarResposta(@RequestBody RespostaModel resposta){
        return ResponseEntity.ok(service.cadastrar(resposta));
    }
    @PutMapping(path = "/resposta/{id}")
    public ResponseEntity<RespostaModel> alterarResposta(@RequestBody RespostaModel resposta){
        return ResponseEntity.ok(service.alterar(resposta));
    }
    @DeleteMapping(path = "/resposta/{id}")
    public ResponseEntity<String>deletarResposta(@PathVariable Long id){
        service.deletar(id);
       return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deletado com sucesso!");
    }


}
