package br.com.book.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.book.beans.Categoria;
import br.com.book.cnn.ConnectionFactory;

public class CategoriaDAO {
	
	public static List<Categoria> getListCategorias() {
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM CATEGORIA;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsCategoria = pStmt.executeQuery();
			
			while (rsCategoria.next()) {
				Categoria categoria = new Categoria();
				categoria.setId(rsCategoria.getInt("ID"));
				categoria.setTitulo(rsCategoria.getString("TITULO"));
				
				listaCategorias.add(categoria);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaCategorias;
	}
	
	public static Categoria getCategoriaByID(int idCategoria) {
		Categoria categoria = new Categoria();
		
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM CATEGORIA WHERE ID = ?;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, idCategoria);
			ResultSet rsCategoria = pStmt.executeQuery();
			
			if(rsCategoria.next()) {
				categoria.setId(idCategoria);
				categoria.setTitulo(rsCategoria.getString("TITULO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return categoria;
	}

}
