package br.com.compromissos.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public void insertUsuario(int idPessoa, String login, String senha, Connection conexao) {
        String insert = "INSERT INTO USUARIO(ID_PESSOA, LOGIN, SENHA) VALUES(";
        insert += idPessoa + ", ";
        insert += "'" + login + "', ";
        insert += "'" + senha + "')";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(insert);
            pStmt.executeUpdate();
            System.out.println("Usuário " + login + " adicionado ao banco de dados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getListUsers(Connection conexao) {
        String getList = "SELECT * FROM USUARIO;";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(getList);

            return pStmt.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public ResultSet getUser(String login, Connection conexao) {
        String getUser = "SELECT * FROM USUARIO WHERE LOGIN = '" + login + "';";
        
        try {
            PreparedStatement pStmt = conexao.prepareStatement(getUser);

            return pStmt.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public boolean verifyUsuarioExistente(String login, Connection conexao) {
        String verify = "SELECT LOGIN FROM USUARIO WHERE LOGIN = '" + login + "';";
        
        try {
            PreparedStatement pStmt = conexao.prepareStatement(verify);
            ResultSet resultado = pStmt.executeQuery();
            
            if(resultado.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    public int getIdPessoaByLogin(String login, Connection conexao) {
        String getIdPessoa = "SELECT ID_PESSOA FROM USUARIO WHERE LOGIN = '" + login + "';";
        
        try {
            PreparedStatement pStmt = conexao.prepareStatement(getIdPessoa);
            ResultSet resultado = pStmt.executeQuery();
            
            if(resultado.next()) {
                return resultado.getInt("ID_PESSOA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
        
}
