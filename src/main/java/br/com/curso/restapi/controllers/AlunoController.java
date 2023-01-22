package br.com.curso.restapi.controllers;

import br.com.curso.restapi.dtos.AlunoCreateDto;
import br.com.curso.restapi.dtos.AlunoDto;
import br.com.curso.restapi.dtos.AlunoUpdateDto;
import br.com.curso.restapi.models.Aluno;
import br.com.curso.restapi.services.interfaces.IAlunoCrudService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController()
public class AlunoController {

    private IAlunoCrudService alunoCrudService;

    public AlunoController(IAlunoCrudService alunoCrudService) {
        this.alunoCrudService = alunoCrudService;
    }


    @GetMapping("/alunos") //lista os alunos
    public List<AlunoDto> listAlunos() {
//        List<AlunoDto> alunosDtos = new ArrayList<AlunoDto>(); //Cria lista para retornar
//        List<Aluno> alunos = repository.findAll(); // consulta os alunos no banco
//
//        for (Aluno aluno : alunos) { //executa o bloco abaixo '{}' para cada aluno
//            AlunoDto alunoDto = new AlunoDto(aluno); //crio um aluno Dto a partir do aluno da lista
//            alunosDtos.add(alunoDto); // adiciona o alunoDto para a lista de alunosDtos que vai ser retornado
//        }
//
//        return alunosDtos;
        return this.alunoCrudService.listAlunos();
    }

    @PostMapping("/alunos") //cria o aluno
    public AlunoDto createAluno(@RequestBody AlunoCreateDto alunoCreateDto) {
//        Aluno aluno = new Aluno();
//        aluno.setNome(alunoCreateDto.getNome());
//        aluno = repository.save(aluno);
//
//        AlunoDto alunoDto = new AlunoDto(aluno);
//        return alunoDto;
        return this.alunoCrudService.createAluno(alunoCreateDto);
    }

    @PutMapping("/alunos/{id}") //atualiza o aluno
    public void updateAluno(
            @PathVariable Long id,
            @RequestBody AlunoUpdateDto alunoUpdateDto) {

//        Optional<Aluno> alunoOptional = this.repository.findById(id);
//
//        if (alunoOptional.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Identificador não encontrado. Id:" + id); //retorna NotFound ('Não encontrado para a url');
//        }
//
//        Aluno aluno = alunoOptional.get();
//        aluno.setNome(alunoUpdateDto.getNome());
//        aluno.setMedia(alunoUpdateDto.getMedia());
//
//        this.repository.save(aluno);
        this.alunoCrudService.updateAluno(id, alunoUpdateDto);
    }

    @GetMapping ("/alunos/{id}") //Busca aluno pelo id
    public AlunoDto getAluno(@PathVariable Long id) {

//        Optional<Aluno> alunoOptional = this.repository.findById(id);
//
//        if (alunoOptional.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Identificador não encontrado. Id:" + id); //retorna NotFound ('Não encontrado para a url');
//        }
//
//        Aluno aluno = alunoOptional.get();
//        AlunoDto alunoDto = new AlunoDto(aluno);
//        return alunoDto;
        return this.alunoCrudService.getAluno(id);
    }

    @DeleteMapping ("/alunos/{id}") //Deleta aluno pelo id
    public void deleteAluno(@PathVariable Long id) {

//        Optional<Aluno> alunoOptional = this.repository.findById(id);
//
//        if (alunoOptional.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Identificador não encontrado. Id:" + id); //retorna NotFound ('Não encontrado para a url');
//        }
//
//        Aluno aluno = alunoOptional.get();
//        this.repository.delete(aluno);
        this.alunoCrudService.deleteAluno(id);
    }
}
