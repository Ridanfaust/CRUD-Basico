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

@Entity // Usando a anotação do Spring para definir a classe como o modelo ou domínio
@Table(name = "TBL_FILMES") // Anotação usada para criação da tabela TBL_FILMES
public class Filmes implements Serializable {

	// Default serialVersionUID
	private static final long serialVersionUID = 1L;
	
	@Id // Anotação para garantir que o id seja a chave identificadora na tabela
	@SequenceGenerator(name = "seq_gen", sequenceName = "seq", allocationSize = 1) // Gera uma sequência numérica
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen") // Utiliza a sequência para popular o id na tabela
	private Long id;

	// Demais colunas da TBL_FILMES
	@Column(name = "NOME", length = 100, nullable = false)
	@NotEmpty(message = "Informe o nome do filme")
	private String nome;

	@Column(name = "GENERO", length = 20, nullable = false)
	@NotEmpty(message = "Informe o gênero do filme")
	private String genero;

	@Column(name = "SINOPSE", nullable = false)
	private String sinopse;

	@Column(name = "ANOTACAO")
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
	
	// Pela simplicidade do projeto e uso do Spring, não serão criados construtores e métodos extra para esta classe

}
