package br.com.compromissos.dao;

import java.sql.*; 
import javax.swing.JOptionPane;

public class CompromissosDAO {
    
    public void insertCompromisso(int idPessoa, String titulo, String local, String data, Connection conexao) {
        //14-01-2004
        String dataFinal = "" + data.substring(6, 10) + "-" +
                data.substring(3, 5) + "-" +
                data.substring(0, 2);
        
        String insert = "INSERT INTO COMPROMISSOS(ID_PESSOA, TITULO, LOCAL_COMPROMISSO, DATA) VALUES(";
        insert += idPessoa + ", ";
        insert += "'" + titulo + "', ";
        insert += "'" +  local + "', ";
        insert += "'" +  dataFinal + "')";
        
        try {
            PreparedStatement pStmt = conexao.prepareStatement(insert);
            pStmt.executeUpdate();
            System.out.println("Compromisso " + titulo + " adicionado ao banco de dados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ResultSet getListCompromissos(int idPessoa, Connection conexao) {
        String getList = "SELECT * FROM COMPROMISSOS WHERE ID_PESSOA = " + idPessoa + ";";
        
        try {
            PreparedStatement pStmt = conexao.prepareStatement(getList);
            
            return pStmt.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
