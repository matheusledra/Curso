package br.com.book.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.book.beans.UsuarioLivros;
import br.com.book.cnn.ConnectionFactory;

public class UsuarioLivrosDAO {

	public static List<UsuarioLivros> getListaLivrosUsuario(int idUsuario) {
		Connection cnn = ConnectionFactory.getConnection();
		List<UsuarioLivros> listaLivrosUsuario = new ArrayList<UsuarioLivros>();
		String query = "SELECT * FROM USUARIO_LIVROS WHERE USUARIO_ID = ?;";

		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, idUsuario);
			
			ResultSet rsLivrosUsario = pStmt.executeQuery();
			
			while(rsLivrosUsario.next()) {
				UsuarioLivros userLivros = new UsuarioLivros();
				userLivros.setId(rsLivrosUsario.getInt("ID"));
				userLivros.setIdUsuario(rsLivrosUsario.getInt("USUARIO_ID"));
				userLivros.setIdLivro(rsLivrosUsario.getInt("LIVROS_ID"));
				userLivros.setIdRelacionamento(rsLivrosUsario.getInt("RELACIONAMENTO_ID"));
				userLivros.setQntdVezesLido(rsLivrosUsario.getInt("QNTD_LIDO"));
				
				listaLivrosUsuario.add(userLivros);
			}
			
			pStmt.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaLivrosUsuario;
	}
}
