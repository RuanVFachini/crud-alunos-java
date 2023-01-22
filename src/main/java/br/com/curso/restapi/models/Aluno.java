package br.com.curso.restapi.models;

import jakarta.persistence.*;

import lombok.Data;

@Entity // Declara que a classe é um registro do banco de dados
@Data // Lombok ajuda no getter e setter automatico
@Table(name = "alunos") // nome da tabela no banco
public class Aluno {
    @Id //Indica que é o identificador na tabela
    @GeneratedValue //valor gerado automaticamente
    @Column(name = "codigo") // nome da coluna na tabela
    private Long id;

    private String nome;
    private float media = 0;
}
