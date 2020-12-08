package br.com.book.model;

import java.util.List;

import br.com.book.beans.Livros;
import br.com.book.dao.LivrosDAO;

public class LivrosModel {

	public List<Livros> getListaLivros() {
		return LivrosDAO.getListaLivros();
	}
	
	public List<Livros> getListaLivrosTitulo(String titulo) {
		return LivrosDAO.getListaLivrosTitulo(titulo);
	}
}
