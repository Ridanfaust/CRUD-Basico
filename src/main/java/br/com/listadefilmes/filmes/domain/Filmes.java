package br.com.listadefilmes.filmes.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "TBL_FILMES")
public class Filmes implements Serializable{
	
	// Default serialVersionUID
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq_gen", sequenceName = "seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
	private Long id;
	
	@Column(name="NOME", length=100, nullable=false)
	@NotEmpty(message = "Informe o nome do filme")
	private String nome;
	
	@Column(name="GENERO", length=20, nullable=false)
	@NotEmpty(message = "Informe o gênero do filme")
	private String genero;
		
	@Column(name="SINOPSE", nullable=false)
	//@NotEmpty(message = "Sinopse não pode estar em branco, sobre o que é o filme?")
	private String sinopse;
	
	@Column(name="ANOTACAO")
	private String anotacao;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}
	
}
