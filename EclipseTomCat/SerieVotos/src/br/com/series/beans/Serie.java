package br.com.series.beans;

import java.io.Serializable;

public class Serie implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id, votos;
	private String titulo;

	public Serie() {
	}

	public Serie(int id, int votos, String titulo) {
		super();
		this.id = id;
		this.votos = votos;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
