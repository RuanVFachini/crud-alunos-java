package br.com.curso.restapi.services.interfaces;

import br.com.curso.restapi.dtos.AlunoCreateDto;
import br.com.curso.restapi.dtos.AlunoDto;
import br.com.curso.restapi.dtos.AlunoUpdateDto;

import java.util.List;

public interface IAlunoCrudService {
    List<AlunoDto> listAlunos();
    AlunoDto createAluno(AlunoCreateDto alunoCreateDto);
    void updateAluno(Long id, AlunoUpdateDto alunoUpdateDto);
    AlunoDto getAluno(Long id);
    void deleteAluno(Long id);
}
