import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.DAO.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {
	
	public static void main(String[] args) throws SQLException {
		
		Produto comoda = new Produto("Comoda", "Cômoda Vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			
			new ProdutoDAO(connection).salvar(comoda);
			List<Produto> listaDeProdutos = new ProdutoDAO(connection).listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
	}
}
