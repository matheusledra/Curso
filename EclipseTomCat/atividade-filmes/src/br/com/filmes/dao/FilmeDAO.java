package br.com.filmes.dao;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.filmes.beans.*;
import br.com.filmes.cnn.ConnectionFactory;

public class FilmeDAO implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Connection cnn = ConnectionFactory.getConnection();

	public static ArrayList<Filme> getListFilmes() {
		ArrayList<Filme> listFilmes = new ArrayList<Filme>();

		try {
			String query = "SELECT * FROM FILME";

			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				Filme filme = new Filme(rs.getInt("ID"), rs.getString("TITULO"), rs.getString("DESCRICAO"),
						rs.getString("CLASSIFICACAO"), rs.getString("GENERO"), rs.getBoolean("TOP_FILME"));

				listFilmes.add(filme);
			}

			if (listFilmes.size() < 1) {
				listFilmes = null;
			}
			pStmt.close();
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

			while (rs.next()) {
				Filme filme = new Filme(rs.getInt("ID"), rs.getString("TITULO"), rs.getString("DESCRICAO"),
						rs.getString("CLASSIFICACAO"), rs.getString("GENERO"), rs.getBoolean("TOP_FILME"));

				topFilmes.add(filme);
			}
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			topFilmes = null;
		}
		return topFilmes;
	}

	public static int addFilme(Filme filme) {
		String query = "INSERT INTO FILME(TITULO, DESCRICAO, CLASSIFICACAO, GENERO, TOP_FILME) VALUE(?, ?, ?, ?, "
				+ filme.isTopFilme() + ");";
		int linhasAfetadas = 0;
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, filme.getTitulo());
			pStmt.setString(2, filme.getDescricao());
			pStmt.setString(3, filme.getClassificacao());
			pStmt.setString(4, filme.getGenero());

			linhasAfetadas = pStmt.executeUpdate();
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public static int deleteFilme(int id) {
		int linhasAfetadas = 0;

		try {
			String delete = "DELETE FROM FILME WHERE ID = " + id + ";";
			PreparedStatement pStmt = cnn.prepareStatement(delete);
			linhasAfetadas = pStmt.executeUpdate();
			pStmt.close();
			

			PreparedStatement testExistemFilmes = cnn.prepareStatement("SELECT * FROM FILME;");
			ResultSet rs = testExistemFilmes.executeQuery();

			if (!rs.next()) {
				String anoAtual = ("" + Calendar.getInstance().get(Calendar.YEAR)).substring(2, 4);
				String resetID = "ALTER TABLE filme AUTO_INCREMENT = " + anoAtual + "0001" + ";";

				PreparedStatement resetaID = cnn.prepareStatement(resetID);
				resetaID.executeUpdate();
				resetaID.close();
			}
			testExistemFilmes.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int editFilme(Filme filme) {
		int linhasAfetadas = 0;
		String query = "UPDATE FILME SET TITULO = ?, DESCRICAO = ?, CLASSIFICACAO = ?, GENERO = ?, TOP_FILME = ? WHERE ID = " + filme.getID() + ";";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setString(1, filme.getTitulo());
			pStmt.setString(2, filme.getDescricao());
			pStmt.setString(3, filme.getClassificacao());
			pStmt.setString(4, filme.getGenero());
			pStmt.setBoolean(5, filme.isTopFilme());
			
			linhasAfetadas = pStmt.executeUpdate();
			
			pStmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}

	public static Filme getFilme(int id) {
		Filme filme = new Filme();
		String query = "SELECT * FROM FILME WHERE ID = " + id + ";";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsFilme = pStmt.executeQuery();
			
			if(rsFilme.next()) {
				filme.setID(id);
				filme.setTitulo(rsFilme.getString("TITULO"));
				filme.setGenero(rsFilme.getString("GENERO"));
				filme.setClassificacao(rsFilme.getString("CLASSIFICACAO"));
				filme.setDescricao(rsFilme.getString("DESCRICAO"));
				filme.setTopFilme(rsFilme.getBoolean("TOP_FILME"));
			}
			pStmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return filme;
	}

}
