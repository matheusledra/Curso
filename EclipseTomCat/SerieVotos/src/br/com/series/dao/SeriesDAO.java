package br.com.series.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.series.beans.Serie;
import br.com.series.cnn.ConnectionFactory;

public class SeriesDAO {
	public static Connection cnn = ConnectionFactory.getConnection();

	public static List<Serie> getListSeries() {
		String query = "SELECT * FROM SERIE;";
		List<Serie> listSeries = new ArrayList<Serie>();
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				Serie serie = new Serie(rs.getInt("ID"), rs.getInt("VOTOS"), rs.getString("TITULO"));
				listSeries.add(serie);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listSeries;
	}

}
