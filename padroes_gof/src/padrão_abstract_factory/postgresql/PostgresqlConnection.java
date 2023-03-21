package padrão_abstract_factory.postgresql;

import padrão_abstract_factory.DatabaseConnection;

public class PostgresqlConnection extends DatabaseConnection {

	public PostgresqlConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostgresqlConnection(String login, String password, String urlDb) {
		super(login, password, urlDb);
		// TODO Auto-generated constructor stub
	}

}
