package padrão_abstract_factory.mysql;

import padrão_abstract_factory.ConnectionFactory;
import padrão_abstract_factory.DatabaseConnection;

public class MysqlConnectionFactory implements ConnectionFactory {
	@Override
	public DatabaseConnection openConnection() {
		// um codigo aqui para abrir uma conexao
		return new MysqlConnection();
	}

	@Override
	public DatabaseConnection closeConnection() {
		// um codigo aqui para fechar uma conexao
		return new MysqlConnection();
	}

}
