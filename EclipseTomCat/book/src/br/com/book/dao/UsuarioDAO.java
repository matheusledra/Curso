package br.com.book.dao;

import java.sql.*;

import br.com.book.beans.Usuario;
import br.com.book.cnn.ConnectionFactory;

public class UsuarioDAO {

	public static Usuario getUsuario(String login, String senha) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM USUARIO WHERE LOGIN = ? AND SENHA = ?;";
		Usuario user = new Usuario();
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, login);
			pStmt.setString(2, senha);
			ResultSet rsUsuarios = pStmt.executeQuery();
			
			if (rsUsuarios.next()) {
				user.setId(rsUsuarios.getInt("ID"));
				user.setLogin(rsUsuarios.getString("LOGIN"));
				user.setNome(rsUsuarios.getString("NOME"));
				user.setSenha(rsUsuarios.getString("SENHA"));
				user.setStatus(rsUsuarios.getInt("STATUS"));
			} else {
				user = null;
			}
			
			pStmt.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}
	
	public static boolean verificaUsuarioExistente(String user) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM USUARIO WHERE LOGIN = ?;";
		boolean existe = false;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, user);
			ResultSet rsUsuarios = pStmt.executeQuery();
			
			if (rsUsuarios.next()) {
				existe = true;
			}
			
			pStmt.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return existe;
	}
	
	public static int novoUsuario(Usuario user) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "INSERT INTO USUARIO(NOME, LOGIN, SENHA) VALUES (?, ?, ?);";
		int linhasAfetadas = 0;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, user.getNome());
			pStmt.setString(2, user.getLogin());
			pStmt.setString(3, user.getSenha());
			
			linhasAfetadas = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
}
