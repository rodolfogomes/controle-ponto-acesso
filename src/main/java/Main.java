

import java.sql.Connection;
import java.sql.SQLException;

import br.com.estudo.config.database.JdbcConnection;

public class Main {

	public static void main(String[] args) throws SQLException  {
		
		Connection con = null;
		try {
			con = JdbcConnection.getConnection();
			System.out.println("Conexão realizada com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			con.close();
			
		}

	}

}
