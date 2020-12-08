package br.com.book.cnn;

import java.sql.*;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/book?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String senha = "267589";

			Connection cnn = DriverManager.getConnection(url, user, senha);
			return cnn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
