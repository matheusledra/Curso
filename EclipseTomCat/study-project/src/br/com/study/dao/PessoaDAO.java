package br.com.study.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.study.beans.*;
import br.com.study.cnn.ConnectionFactory;

public class PessoaDAO {
	
	public static ArrayList<Pessoa> listaPessoas() {
		Connection cnn = ConnectionFactory.getConnection();
		
		String query = "SELECT * FROM PESSOA;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet resulSet = pStmt.executeQuery();
			
			ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			while(resulSet.next()) {
				String sexo = "";
				if(resulSet.getString("SEXO").charAt(0) == 'M') {
					sexo = "MASCULINO";
				} else {
					sexo = "FEMININO";
				}
				Pessoa pessoa = new Pessoa(resulSet.getInt("ID"), resulSet.getString("NOME"), resulSet.getDate("DT_NASCIMENTO") + "", sexo);
				
				listaPessoas.add(pessoa);
			}
			
			return listaPessoas;
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int adicionarPessoa(Pessoa pessoa) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "INSERT INTO PESSOA(ID, NOME, DT_NASCIMENTO, SEXO) VALUES(" + newID() + ", '" + pessoa.getNome() + "', '" +  pessoa.getDtNascimento() + "', '" + pessoa.getSexo() + "');";
		int linhasAfetadas = 0;
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			linhasAfetadas = pStmt.executeUpdate();
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	private static long newID() {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM PESSOA;";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			long newID = 0;
			while(rs.next()) {
				newID = rs.getLong("ID") + 1;
			}
			return newID;
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public static Pessoa getPessoaById(long id) {
		Pessoa pessoa = null;
		Connection cnn = ConnectionFactory.getConnection();
		String query = "SELECT * FROM PESSOA WHERE ID = " + id;
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				String sexo = "";
				if(rs.getString("SEXO").charAt(0) == 'M') {
					sexo = "MASCULINO";
				} else {
					sexo = "FEMININO";
				}
				pessoa = new Pessoa(rs.getInt("ID"), rs.getString("NOME"), rs.getDate("DT_NASCIMENTO") + "", sexo);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pessoa;
	}

	public static int editarPessoa(Pessoa pessoa) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "UPDATE PESSOA "
				+ "SET NOME= '" + pessoa.getNome() + "', DT_NASCIMENTO = '" + pessoa.getDtNascimento() + "', SEXO = '" + pessoa.getSexo().charAt(0) + "' "
						+ "WHERE ID = " + pessoa.getId() + ";";
		int linhasAfetadas = 0;
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			linhasAfetadas = pStmt.executeUpdate();
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
	public static int deletarPessoa(long id) {
		Connection cnn = ConnectionFactory.getConnection();
		String query = "DELETE FROM PESSOA WHERE ID = " + id + ";";
		
		int linhasAfetadas = 0;
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			linhasAfetadas = pStmt.executeUpdate();
			
			PreparedStatement testExistemPessoas = cnn.prepareStatement("SELECT * FROM PESSOA;");
			ResultSet rs = testExistemPessoas.executeQuery();
			
			if(!rs.next()) {
				int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
				String resetID = "ALTER TABLE pessoa AUTO_INCREMENT = " + anoAtual + "0001" + ";";
				
				PreparedStatement resetaID = cnn.prepareStatement(resetID);
				resetaID.executeUpdate();
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
	
}
