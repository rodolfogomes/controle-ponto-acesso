package br.com.estudo.config.database;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcConnection {
	
	private static  Connection conn = null;
	private static final String USUARIO = "root";
  private static final String SENHA = "root";
  private static final String URL = "jdbc:mysql://127.0.0.1:3306/controlePontoAcesso";

	
	public static Connection getConnection() throws SQLException {
		
			return DriverManager.getConnection(URL, USUARIO, SENHA);
	}

	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
