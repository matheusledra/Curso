package br.com.book.model;

import java.util.List;

import br.com.book.beans.Categoria;
import br.com.book.dao.CategoriaDAO;

public class CategoriaModel {
	
	public List<Categoria> getListCategorias() {
		return CategoriaDAO.getListCategorias();
	}
}
