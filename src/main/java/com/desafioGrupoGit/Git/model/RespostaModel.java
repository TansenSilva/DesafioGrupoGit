package com.desafioGrupoGit.Git.model;

import com.desafioGrupoGit.Git.model.Enum.StatusTopico;
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
    private Long id;

    @Column(nullable = false)
    private String mensagem;

    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column
    private Boolean solucao = false;

    @Column
    @Enumerated(value = EnumType.STRING)
    private StatusTopico status;

}
