package padrão_abstract_factory.postgresql;

import padrão_abstract_factory.ConnectionFactory;
import padrão_abstract_factory.DatabaseConnection;

public class PostgresqlConnectionFactory implements ConnectionFactory {
	@Override
	public DatabaseConnection openConnection() {
		// um codigo aqui para abrir uma conexao
		return new PostgresqlConnection();
	}

	@Override
	public DatabaseConnection closeConnection() {
		// um codigo aqui para abrir uma conexao
		return new PostgresqlConnection();
	}

}
