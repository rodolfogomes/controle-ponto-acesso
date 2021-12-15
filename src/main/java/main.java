

import java.sql.SQLException;

import br.com.estudo.controller.CategoriaUsuarioController;
import br.com.estudo.model.CategoriaUsuario;

public class Main {

	public static void main(String[] args) throws SQLException  {
		
			CategoriaUsuario novaCategoria = new CategoriaUsuario();
			
			novaCategoria.setCodigoCategoria(1001);
			novaCategoria.setDescricao("funcionario");
			
			CategoriaUsuarioController controller = new CategoriaUsuarioController();
			
			controller.insere(novaCategoria);
			
	}

}
