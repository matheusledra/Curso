package br.com.compromissos.dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class PessoaDAO {

    public void insertPessoa(String nome, int idade, String sexo, Connection conexao) {
        String insert = "INSERT INTO PESSOA(NOME, IDADE, SEXO) VALUES(";
        insert += "'" + nome + "', ";
        insert += idade + ", ";
        insert += "'" + sexo + "')";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(insert);
            pStmt.executeUpdate();
            System.out.println(nome + " foi adicionado ao banco de dados");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getListPessoa(Connection conexao) {
        String getList = "SELECT * FROM PESSOA;";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(getList);

            return pStmt.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public int getIdPessoa(String nomePessoa, Connection conexao) {
        String getId = "SELECT ID FROM PESSOA WHERE NOME = '" + nomePessoa + "';";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(getId);
            ResultSet resultadoBusca = pStmt.executeQuery();

            if (resultadoBusca.next()) {
                return Integer.parseInt(resultadoBusca.getString("ID"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }

    public String getNomePessoa(int idPessoa, Connection conexao) {
        String nome = "";

        String getNome = "SELECT NOME FROM PESSOA WHERE ID = '" + idPessoa + "';";

        try {
            PreparedStatement pStmt = conexao.prepareStatement(getNome);
            ResultSet resultadoBusca = pStmt.executeQuery();

            if (resultadoBusca.next()) {
                nome = resultadoBusca.getString("NOME");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }

        return nome;
    }

}
