package br.com.compromissos.connection;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    public static Connection getConnection() {
            String url = "jdbc:mysql://localhost:3306/compromissos?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String pwd = "267589";
        try{
            Connection cnct = DriverManager.getConnection(url, user, pwd);
            
            return cnct;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro " + e.getSQLState() + "!", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
