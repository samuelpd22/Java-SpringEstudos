package br.com.samuel.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuel.projeto.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long>{

}
