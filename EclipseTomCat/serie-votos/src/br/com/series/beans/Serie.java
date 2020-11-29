package br.com.series.beans;

import java.io.Serializable;

public class Serie implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private int id, votos;
	
	public Serie() {}
	
	public Serie(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Serie(int id, String nome, int votos) {
		this.id = id;
		this.nome = nome;
		this.votos = votos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	

}
