package bt.com.diario.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.diario.beans.Nota;
import br.com.diario.cnn.ConnectionFactory;

public class NotaDAO {
	private static Connection cnn = ConnectionFactory.getConnection();

	public static List<Nota> getListaNotas() {
		List<Nota> listaNotas = new ArrayList<Nota>();
		
		String query = "SELECT * FROM NOTA;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				Nota nota = new Nota(rs.getInt("ID"), rs.getString("assunto"), rs.getString("dt_nota"), rs.getString("texto"));
				
				listaNotas.add(nota);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaNotas;
	}

	public static Nota getNotaByID(int id) {
		Nota notaRetorno = new Nota();
		String query = "SELECT * FROM NOTAS WHERE ID = ?";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				notaRetorno = new Nota(rs.getInt("ID"), rs.getString("assunto"), rs.getString("dt_nota"), rs.getString("texto"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return notaRetorno;
	}

}
