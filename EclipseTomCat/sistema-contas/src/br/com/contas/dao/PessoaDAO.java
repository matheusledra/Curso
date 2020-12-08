package br.com.contas.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.contas.beans.Conta;
import br.com.contas.cnn.ConnectionFactory;

public class PessoaDAO {
	
	public static List<Conta> getListConta(int idPessoa) {
		Connection cnn = ConnectionFactory.getConnection();
		List<Conta> returnList = new ArrayList<Conta>();
		String query = "SELECT * FROM CONTAS WHERE ID_PESSOA = " + idPessoa + ";";
		
		try {
			PreparedStatement pStmt = cnn.prepareStatement(query);
			ResultSet rsContas = pStmt.executeQuery();
			
			while(rsContas.next()) {
				Conta conta = new Conta();
				conta.setId(rsContas.getInt("ID"));
				conta.setIdPessoa(idPessoa);
				conta.setIdTipoConta(rsContas.getInt("ID_TIPO_CONTA"));
				conta.setTitulo(rsContas.getString("TITULO"));
				conta.setValor(rsContas.getDouble("VALOR"));
				conta.setDataConta("" + rsContas.getDate("DATA_CONTA"));
				conta.setQuitado(rsContas.getBoolean("QUITADO"));
				
				if(rsContas.getInt("ID_PESSOA_VINCULADA") != 0) {
					conta.setIdPessoaVinculada(rsContas.getInt("ID_PESSOA_VINCULADA"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return returnList;
	}

}
