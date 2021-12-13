package br.com.estudo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	private Connection conn = null;
	
	private  Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/controle-ponto-acesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
