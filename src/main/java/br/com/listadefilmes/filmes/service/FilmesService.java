package br.com.listadefilmes.filmes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.listadefilmes.filmes.domain.Filmes;
import br.com.listadefilmes.filmes.repository.FilmesRepository;

@Service
public class FilmesService {

		@Autowired
		private FilmesRepository dao;
		
		/*
		 * CRUD Operations
		 */
		
		// Create e Update
		public Filmes save(Filmes filme) {
			return dao.saveAndFlush(filme);
		}
		
		// Read
		public List<Filmes> findAll() {
			return dao.findAll();
		}
		
		public Filmes findFilme(Long id) {
			Optional<Filmes> filme = dao.findById(id);
			return filme.isPresent()? filme.get() : null;
		}
		
		// Delete
		public void deleteFilme(Long id) {
			dao.deleteById(id);
		}
		
}
