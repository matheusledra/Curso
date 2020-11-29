package br.com.series.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.series.beans.Serie;
import br.com.series.cnn.ConnectionFactory;

public class SerieDAO {
	private static Connection cnn = ConnectionFactory.getConnection();
	
	public static List<Serie> listSeries() {
		List<Serie> listRetornoSeries = new ArrayList<Serie>();
		String query = "SELECT * FROM SERIE;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsSerie = pStmt.executeQuery();
			
			while(rsSerie.next()) {
				Serie serie = new Serie(rsSerie.getInt("ID"), rsSerie.getString("NOME"), rsSerie.getInt("VOTOS"));
				
				listRetornoSeries.add(serie);
			}
			pStmt.close();
			
			if(listRetornoSeries.size() < 1) {
				listRetornoSeries = null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listRetornoSeries;
	}
	
	public static Serie getSerieByID(int id) {
		Serie serie = new Serie();
		
		String query = "SELECT * FROM SERIE WHERE ID = " + id + ";";
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsSerie = pStmt.executeQuery();
			
			if (rsSerie.next()) {
				serie.setID(id);
				serie.setNome(rsSerie.getString("NOME"));
				serie.setVotos(rsSerie.getInt("VOTOS"));
			} else {
				serie = null;
			}
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return serie;
	}
	
	public static int delSerie(int id) {
		int linhasAfetadas = 0;
		
		String query = "DELETE FROM SERIE WHERE ID = " + id + ";";
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			linhasAfetadas = pStmt.executeUpdate();
			
			pStmt.close();
			
			if(listSeries() == null) {
				String anoAtual = ("" + Calendar.getInstance().get(Calendar.YEAR)).substring(2, 4);
				String resetID = "ALTER TABLE SERIE AUTO_INCREMENT = " + anoAtual + "001" + ";";

				PreparedStatement resetaID = cnn.prepareStatement(resetID);
				resetaID.executeUpdate();
				resetaID.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	
	public static int editSerie(Serie serie) {
		int linhasAfetadas = 0;
		
		String query = "UPDATE SERIE SET NOME = ? WHERE ID = " + serie.getID() + ";";
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			
			pStmt.setString(1, serie.getNome());
			
			linhasAfetadas = pStmt.executeUpdate();
			
			pStmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
	
	public static List<Serie> getTopCinco() {
		List<Serie> topCinco = new ArrayList<Serie>();
		String query = "SELECT * FROM SERIE ORDER BY VOTOS DESC LIMIT 5;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsTops = pStmt.executeQuery();
			
			while(rsTops.next()) {
				Serie serie = new Serie(rsTops.getInt("ID"), rsTops.getString("NOME"), rsTops.getInt("VOTOS"));
				
				topCinco.add(serie);
			}
			pStmt.close();
			
			if (topCinco.size() == 0) {
				topCinco = null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return topCinco;
	}
	
	public static int addVoto(int id) {
		int linhasAfetadas = 0;
		
		try {
			int votosAtuais = getSerieByID(id).getVotos();
			
			String query = "UPDATE SERIE SET VOTOS  = " + (votosAtuais + 1) + " WHERE ID = " + id;
			
			PreparedStatement pStmt = cnn.prepareStatement(query);
			linhasAfetadas = pStmt.executeUpdate();
			
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}

	public static int cadSerie(Serie serie) {
		int linhasAfetadas = 0;
		
		try {
			String query = "INSERT INTO SERIE(NOME) VALUES(?);";
			
			PreparedStatement pStmt = cnn.prepareStatement(query);
			
			pStmt.setString(1, serie.getNome());
			
			linhasAfetadas = pStmt.executeUpdate();
			
			pStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return linhasAfetadas;
	}
}
