package br.com.filmes.model;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.filmes.beans.Filme;
import br.com.filmes.dao.FilmeDAO;

public class FilmeModel implements Serializable{
	private static final long serialVersionUID = 1L;

	public ArrayList<Filme> getListaFilmes(){
		return FilmeDAO.getListFilmes();
	}
	
	public ArrayList<Filme> getTopFilmes(){
		return FilmeDAO.getTopFilmes();
	}
	
	public int addFilme(Filme filme) {
		return FilmeDAO.addFilme(filme);
	}
	
	public Filme getFilme(int id) {
		return FilmeDAO.getFilme(id);
	}

	public int delFilme(int id) {
		return FilmeDAO.deleteFilme(id);
	}

	public int editFilme(Filme filme) {
		return FilmeDAO.editFilme(filme);
	}
}
