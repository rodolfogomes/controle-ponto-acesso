package br.com.estudo.config.database;

public class ConnectionFactory {
	
	private JdbcConnection con =null;
	
	public JdbcConnection getInstance() {
		if(con == null) {
			this.con = new JdbcConnection();
		}
		return this.con;
	}

}
