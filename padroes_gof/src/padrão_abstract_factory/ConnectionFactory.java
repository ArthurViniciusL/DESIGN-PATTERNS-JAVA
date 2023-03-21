package padrão_abstract_factory;

// ou:
/* public abstract class ConnectionFactory {...} */

public interface ConnectionFactory {
	
	public DatabaseConnection openConnection();
	public DatabaseConnection closeConnection();	

}


