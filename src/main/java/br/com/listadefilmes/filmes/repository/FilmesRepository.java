package br.com.listadefilmes.filmes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.listadefilmes.filmes.domain.Filmes;


@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Long>{
	
}
