package padrão_abstract_factory.main;

import padrão_abstract_factory.DatabaseConnection;
import padrão_abstract_factory.ConnectionFactory;
import padrão_abstract_factory.mysql.MysqlConnectionFactory;
// import padrão_abstract_factory.postgresql.PostgresqlConnectionFactory;

public class Main {
	public static void main(String[] args) {

		// ConnectionFactory dbConnectionFactory = new PostgresqlConnectionFactory();
		ConnectionFactory dbConnetion = new MysqlConnectionFactory();
		
		DatabaseConnection newConnection = dbConnetion.openConnection();
		newConnection.runQuerry(null);
		newConnection.getLogin();
		System.out.println(newConnection);


	}

}
