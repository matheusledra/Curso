package br.com.book.beans;

import java.io.Serializable;

public class UsuarioLivros implements Serializable{
	private static final long serialVersionUID = 1L;
	int id, idUsuario, idLivro, idRelacionamento, qntdVezesLido;
	
	public UsuarioLivros() {}
	
	public UsuarioLivros(int id, int idUsuario, int idLivro, int idRelacionamento, int qntdVezesLido) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.idLivro = idLivro;
		this.idRelacionamento = idRelacionamento;
		this.qntdVezesLido = qntdVezesLido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public int getIdRelacionamento() {
		return idRelacionamento;
	}

	public void setIdRelacionamento(int idRelacionamento) {
		this.idRelacionamento = idRelacionamento;
	}

	public int getQntdVezesLido() {
		return qntdVezesLido;
	}

	public void setQntdVezesLido(int qntdVezesLido) {
		this.qntdVezesLido = qntdVezesLido;
	}
}
