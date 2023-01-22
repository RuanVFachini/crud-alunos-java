package br.com.curso.restapi.repositories;

import br.com.curso.restapi.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
}
