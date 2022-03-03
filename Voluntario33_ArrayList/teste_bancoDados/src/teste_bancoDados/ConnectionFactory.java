package teste_bancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;
	
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/spring_teste?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("Elokonamoda15");
		
		this.dataSource = comboPooledDataSource;
	}
	
	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
	}
	
	public void Insert(Connection connection, String nome, String idade) throws SQLException {
		PreparedStatement stm = connection.prepareStatement("INSERT INTO PEOPLE (nome, age) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
		stm.setString(1, nome);
		stm.setString(2, idade);
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi " + id);
		}
	}
	
	public void Remover(Connection connection, int id) throws SQLException {
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE Id == ?");
			stm.setInt(1, id);
			stm.execute();
			
			Integer linhasModificadas = stm.getUpdateCount();
			System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		}
	}
	

