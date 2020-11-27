package br.com.filmes.beans;

import java.io.Serializable;

public class Filme implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo, genero, classificacao, descricao;
	private boolean topFilme;

	public Filme() {}
	
	public Filme(String titulo, String descricao,  String classificacao, String genero, boolean topFilme) {
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.topFilme = topFilme;
		this.descricao = descricao;
	}
	
	public Filme(int id, String titulo, String descricao, String classificacao, String genero, boolean topFilme) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.descricao = descricao;
		this.topFilme = topFilme;
	}
	
	public Filme(int id, String titulo, String descricao, String classificacao, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.classificacao = classificacao;
		this.descricao = descricao;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public boolean isTopFilme() {
		return topFilme;
	}

	public void setTopFilme(boolean topFilme) {
		this.topFilme = topFilme;
	}
}
