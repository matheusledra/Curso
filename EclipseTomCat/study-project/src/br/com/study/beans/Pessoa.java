package br.com.study.beans;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	private String dtNascimento;
	private String sexo;

	public Pessoa() {
	}

	public Pessoa(String nome, String dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, String dtNascimento, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public Pessoa(long id, String nome, String dtNascimento, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
