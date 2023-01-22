package br.com.curso.restapi.dtos;

import br.com.curso.restapi.models.Aluno;
import lombok.Data;

@Data //getter e setter do lombok
public class AlunoCreateDto {
    private String nome;
}
