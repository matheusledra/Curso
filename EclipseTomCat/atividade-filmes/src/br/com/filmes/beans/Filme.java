package br.com.filmes.beans;

import java.io.Serializable;

public class Filme implements Serializable {
	private static final long serialVersionUID = 1L;
	private String titulo, genero;
	private String classificacao;

	public Filme(String titulo, String classificacao, String genero) {
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
}
