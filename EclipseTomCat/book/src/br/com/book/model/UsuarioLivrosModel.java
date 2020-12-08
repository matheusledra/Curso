package br.com.book.model;

import java.util.List;

import br.com.book.beans.UsuarioLivros;
import br.com.book.dao.UsuarioLivrosDAO;

public class UsuarioLivrosModel {

	public List<UsuarioLivros> getLivrosUsuario(int idUsuario) {
		return UsuarioLivrosDAO.getListaLivrosUsuario(idUsuario);
	}

}
