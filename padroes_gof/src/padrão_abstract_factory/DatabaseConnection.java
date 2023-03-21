package padrão_abstract_factory;

public class DatabaseConnection {

	private String login;
	private String password;
	private String urlDb;

	public DatabaseConnection() {
		/*
		 * void constructor
		 */
	}

	public DatabaseConnection(String login, String password, String urlDb) {
		this.login = login;
		this.password = password;
		this.urlDb = urlDb;
	}

	public String runQuerry(String p_querry) {
		String querry = p_querry;
		// um codigo aqui para executar uma querry

		String result = "Resultado... ";

		return result;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlDb() {
		return urlDb;
	}

	public void setUrlDb(String urlDb) {
		this.urlDb = urlDb;
	}

}
