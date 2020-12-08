package br.com.book.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.book.beans.Relacionamento;
import br.com.book.cnn.ConnectionFactory;

public class RelacionamentoDAO {
	
	public static List<Relacionamento> getListRels() {
		List<Relacionamento> listaRels = new ArrayList<Relacionamento>();
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM RELACIONAMENTO";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsRels = pStmt.executeQuery();
			
			while(rsRels.next()) {
				Relacionamento rel = new Relacionamento();
				rel.setId(rsRels.getInt("ID"));
				rel.setTipoRelacionamento(rsRels.getString("TIPO_REL"));
				
				listaRels.add(rel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaRels;
	}

}
