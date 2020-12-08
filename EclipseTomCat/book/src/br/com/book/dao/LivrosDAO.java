package br.com.book.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.book.beans.Livros;
import br.com.book.cnn.ConnectionFactory;

public class LivrosDAO {
	
	public static List<Livros> getListaLivros() {
		Connection cnn = ConnectionFactory.getConnection();
		List<Livros> listaLivros = new ArrayList<Livros>();
		
		String query = "SELECT * FROM LIVROS;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsLivros = pStmt.executeQuery();
			
			while(rsLivros.next()) {
				Livros livro = new Livros();
				livro.setId(rsLivros.getInt("ID"));
				livro.setCategoria(CategoriaDAO.getCategoriaByID(rsLivros.getInt("CATEGORIA_ID")).getTitulo());
				livro.setTitulo(rsLivros.getString("TITULO"));
				livro.setAutor(rsLivros.getString("AUTOR"));
				
				listaLivros.add(livro);
			}
			
			pStmt.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaLivros;
	}

	public static List<Livros> getListaLivrosTitulo(String titulo) {
		Connection cnn = ConnectionFactory.getConnection();
		List<Livros> listaLivros = new ArrayList<Livros>();
		
		String query = "SELECT * FROM LIVROS WHERE TITULO LIKE '%" + titulo + "%';";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsLivros = pStmt.executeQuery();
			
			while(rsLivros.next()) {
				Livros livro = new Livros();
				livro.setId(rsLivros.getInt("ID"));
				livro.setCategoria(CategoriaDAO.getCategoriaByID(rsLivros.getInt("CATEGORIA_ID")).getTitulo());
				livro.setTitulo(rsLivros.getString("TITULO"));
				livro.setAutor(rsLivros.getString("AUTOR"));
				
				listaLivros.add(livro);
			}
			
			pStmt.close();
			cnn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaLivros;
	}

}
