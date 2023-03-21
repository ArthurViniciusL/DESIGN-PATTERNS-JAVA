package padrão_abstract_factory.mysql;

import padrão_abstract_factory.DatabaseConnection;

public class MysqlConnection extends DatabaseConnection {

	public MysqlConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MysqlConnection(String login, String password, String urlDb) {
		super(login, password, urlDb);
		// TODO Auto-generated constructor stub
	}

}
