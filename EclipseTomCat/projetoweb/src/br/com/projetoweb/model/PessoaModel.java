package br.com.projetoweb.model;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.projetoweb.beans.Pessoa;
import br.com.projetoweb.dao.PessoaDAO;

public class PessoaModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Pessoa> listaPessoas() {
		return PessoaDAO.listaPessoas();
	}
	
	public Pessoa getPessoa(int id) {
		return PessoaDAO.getPessoa(id);
	}
}
