package br.com.listadefilmes.filmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.listadefilmes.filmes.domain.Filmes;
import br.com.listadefilmes.filmes.repository.FilmesRepository;

@Service // Anotação do Spring para definir a classe como serviço padrão Spring MVC.
public class FilmesService {

	@Autowired // Cria uma instância do DAO assim que o serviço for chamado.
	private FilmesRepository dao;

	/*
	 * Operações CRUD
	 */

	// Create e Update:
	public Filmes save(Filmes filme) {
		return dao.saveAndFlush(filme);
	}

	// Read:
	public List<Filmes> findAll() {
		return dao.findAll();
	}

	public Filmes findFilme(Long id) {
		Optional<Filmes> filme = dao.findById(id);
		return filme.isPresent() ? filme.get() : null;
	}

	// Delete:
	public void deleteFilme(Long id) {
		dao.deleteById(id);
	}

}
