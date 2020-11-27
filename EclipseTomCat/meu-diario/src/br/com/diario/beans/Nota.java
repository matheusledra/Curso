package br.com.diario.beans;

import java.io.Serializable;

public class Nota implements Serializable{
	private static final long serialVersionUID = 1L;
	private String assunto, dtNota, texto;
	private int id;
	
	public Nota() {}
	
	public Nota(int id, String assunto, String dtNota, String texto) {
		
	} 
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDtNota() {
		return dtNota;
	}
	public void setDtNota(String dtNota) {
		this.dtNota = dtNota;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
