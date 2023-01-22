package br.com.curso.restapi.dtos;

import lombok.Data;

@Data //getter e setter do lombok
public class AlunoUpdateDto {
    private String nome;
    private float media;
}
