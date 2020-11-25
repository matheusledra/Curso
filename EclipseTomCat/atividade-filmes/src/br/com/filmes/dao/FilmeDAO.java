package br.com.filmes.dao;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;

import br.com.filmes.beans.*;
import br.com.filmes.cnn.ConnectionFactory;

public class FilmeDAO implements Serializable{
	private static final long serialVersionUID = 1L;
	private static Connection cnn = ConnectionFactory.getConnection();
	
	public static ArrayList<Filme> getListFilmes() {
		ArrayList<Filme> listFilmes = new ArrayList<Filme>();
		
		try {
			String query = "SELECT * FROM FILME";
			
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				Filme filme = new Filme(rs.getString("TITULO"), "" + rs.getString("CLASSIFICACAO"), rs.getString("GENERO"));
				
				listFilmes.add(filme);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listFilmes;
	}
	
	public static ArrayList<Filme> getTopFilmes() {
		ArrayList<Filme> topFilmes = new ArrayList<Filme>();
		
		try {
			String query = "SELECT * FROM FILME WHERE TOP_FILME = TRUE";
			
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				Filme filme = new Filme(rs.getString("TITULO"), "" + rs.getString("CLASSIFICACAO"), rs.getString("GENERO"));
				
				topFilmes.add(filme);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return topFilmes;
	}
	
	public static void addFilme(String titulo, String classificacao, String genero) {
		String query = "INSERT INTO FILME(TITULO, CLASSIFICACAO, GENERO, TOP_FILME) VALUE('" + titulo + "', '" + classificacao + "', '?', ?)";
		try {
			
			
			
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
