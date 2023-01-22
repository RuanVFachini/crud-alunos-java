package br.com.curso.restapi.dtos;

import br.com.curso.restapi.models.Aluno;
import lombok.Data;

@Data //getter e setter do lombok
public class AlunoDto {
    private Long id;
    private String nome;
    private Boolean aprovado;

    public AlunoDto (Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.aprovado = aluno.getMedia() > 6;
    }
}
