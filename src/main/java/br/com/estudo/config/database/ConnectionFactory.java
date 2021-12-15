package br.com.estudo.config.database;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private  static Connection con =null;
	
	public Connection getInstance() {
		if(con == null) {
			try {
				con =  new JdbcConnection().getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

}
