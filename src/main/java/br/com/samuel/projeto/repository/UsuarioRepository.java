package br.com.samuel.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.samuel.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	
}
