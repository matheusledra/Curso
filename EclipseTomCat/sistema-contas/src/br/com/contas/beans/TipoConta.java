package br.com.contas.beans;

import java.io.Serializable;

public class TipoConta implements Serializable{
	private static final long serialVersionUID = 1L;
	private String tipo;

	public TipoConta() {}
	
	public TipoConta(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
