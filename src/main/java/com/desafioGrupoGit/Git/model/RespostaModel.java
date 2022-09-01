package com.desafioGrupoGit.Git.model;

import ch.qos.logback.core.status.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resposta")
public class RespostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String mensagem;
    @Column
    private LocalDate dataCriacao;
    @Column
    private Boolean solucao = false;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

}
