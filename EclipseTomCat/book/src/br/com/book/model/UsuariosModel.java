package br.com.book.model;

import br.com.book.beans.Usuario;
import br.com.book.dao.UsuarioDAO;

public class UsuariosModel {
	
	public Usuario getUser(String login, String senha) {
		return UsuarioDAO.getUsuario(login, senha);
	}
	
	public boolean verificaUsuarioExistente(String user) {
		return UsuarioDAO.verificaUsuarioExistente(user);
	}
	
	public int novoUsuario(Usuario user) {
		return UsuarioDAO.novoUsuario(user);
	}

}
