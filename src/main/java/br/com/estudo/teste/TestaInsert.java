package br.com.estudo.teste;

import br.com.estudo.controller.CategoriaUsuarioController;
import br.com.estudo.model.CategoriaUsuario;

public class TestaInsert {
	public static void main(String[] args) {
		
		CategoriaUsuario novaCategoria = new CategoriaUsuario();
		
		novaCategoria.setCodigoCategoria(1001);
		novaCategoria.setDescricao("funcionario");
		
		CategoriaUsuarioController controller = new CategoriaUsuarioController();
		
		controller.insere(novaCategoria);
		
		System.out.println("Adicionado!");	
		
	}
	
	
}
