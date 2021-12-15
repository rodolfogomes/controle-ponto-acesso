package br.com.estudo.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.estudo.config.database.ConnectionFactory;
import br.com.estudo.model.CategoriaUsuario;

public class CategoriaUsuarioController {
	
	private Connection connection;
	
	public CategoriaUsuarioController() {
		this.connection = new ConnectionFactory().getInstance();
	}
	
	public void insere(CategoriaUsuario categoriaUsuario) {
		String sql = "insert into categoriaUsuario" +
				"(codigoCategoria,descricao)" + 
				"values(?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, categoriaUsuario.getCodigoCategoria());
			stmt.setString(2, categoriaUsuario.getDescricao());
			
			stmt.execute();
			System.out.println("Adicionado!");	
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
