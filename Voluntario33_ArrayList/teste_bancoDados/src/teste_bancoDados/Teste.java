package teste_bancoDados;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		
		factory.Insert(connection, "Heberty", "12");
		System.out.println("Fechando conexão");
		connection.close();
		

	}

}
