package br.com.study.model;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.study.beans.Pessoa;
import br.com.study.dao.PessoaDAO;

public class PessoaModel implements Serializable{
	private static final long serialVersionUID = 1L;

	public ArrayList<Pessoa> listaPessoas() {
		return PessoaDAO.listaPessoas();
	}
	
	public int novaPessoa(Pessoa pessoa) {
		return PessoaDAO.adicionarPessoa(pessoa);
	}
	
	public Pessoa getPessoaByID(long id) {
		return PessoaDAO.getPessoaById(id);
	}
	
	public int editPessoa(Pessoa pessoa) {
		return PessoaDAO.editarPessoa(pessoa);
	}
	
	public int deletarPessoa(long id) {
		return PessoaDAO.deletarPessoa(id);
	}

}
