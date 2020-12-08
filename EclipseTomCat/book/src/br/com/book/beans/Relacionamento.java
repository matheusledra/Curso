package br.com.book.beans;

import java.io.Serializable;

public class Relacionamento implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String tipoRelacionamento;
	
	public Relacionamento() {}
	
	public Relacionamento(int id, String tipoRelacionamento) {
		super();
		this.id = id;
		this.tipoRelacionamento = tipoRelacionamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoRelacionamento() {
		return tipoRelacionamento;
	}

	public void setTipoRelacionamento(String tipoRelacionamento) {
		this.tipoRelacionamento = tipoRelacionamento;
	}
}
