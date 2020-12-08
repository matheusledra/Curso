package br.com.contas.beans;

import java.io.Serializable;

public class Conta implements Serializable{
	private static final long serialVersionUID = 1L;
	int id, idPessoa, idPessoaVinculada, idTipoConta, entradaSaida;
	boolean quitado;
	String titulo, dataConta;
	double valor;
	
	public Conta() {}
	
	public Conta(int id, int idPessoa, int idPessoaVinculada, int idTipoConta, int entradaSaida, boolean quitado,
			String titulo, String dataConta, double valor) {
		super();
		this.id = id;
		this.idPessoa = idPessoa;
		this.idPessoaVinculada = idPessoaVinculada;
		this.idTipoConta = idTipoConta;
		this.entradaSaida = entradaSaida;
		this.quitado = quitado;
		this.titulo = titulo;
		this.dataConta = dataConta;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public int getIdPessoaVinculada() {
		return idPessoaVinculada;
	}

	public void setIdPessoaVinculada(int idPessoaVinculada) {
		this.idPessoaVinculada = idPessoaVinculada;
	}

	public int getIdTipoConta() {
		return idTipoConta;
	}

	public void setIdTipoConta(int idTipoConta) {
		this.idTipoConta = idTipoConta;
	}

	public int getEntradaSaida() {
		return entradaSaida;
	}

	public void setEntradaSaida(int entradaSaida) {
		this.entradaSaida = entradaSaida;
	}

	public boolean getQuitado() {
		return quitado;
	}

	public void setQuitado(boolean quitado) {
		this.quitado = quitado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataConta() {
		return dataConta;
	}

	public void setDataConta(String dataConta) {
		this.dataConta= dataConta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
