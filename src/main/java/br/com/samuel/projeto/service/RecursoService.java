package br.com.samuel.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samuel.projeto.dto.RecursoDTO;
import br.com.samuel.projeto.entity.RecursoEntity;
import br.com.samuel.projeto.repository.RecursoRepository;
@Service
public class RecursoService {

	@Autowired
	RecursoRepository recursoRepository;

	public List<RecursoDTO> listarTodos(){
		List<RecursoEntity> recurso = recursoRepository.findAll();
		return recurso.stream().map(RecursoDTO::new).toList();
	}

	public void inserir(RecursoDTO recurso) {
		RecursoEntity recursoEntity = new RecursoEntity(recurso);
		recursoRepository.save(recursoEntity);
	}
	public RecursoDTO alterar(RecursoDTO recurso) {
		RecursoEntity recursoEntity = new RecursoEntity(recurso);
		return new RecursoDTO(recursoRepository.save(recursoEntity));
	}
	public void excluir(Long id) {
		RecursoEntity recurso = recursoRepository.findById(id).get();
		recursoRepository.delete(recurso);
	}
	public RecursoDTO buscarPorId(Long id) {
		return new RecursoDTO(recursoRepository.findById(id).get());
	}
}
