package br.com.book.beans;

import java.io.Serializable;

public class Livros implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo, autor, categoria;

	public Livros() {}

	public Livros(int id, String categoria, String titulo, String autor) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
