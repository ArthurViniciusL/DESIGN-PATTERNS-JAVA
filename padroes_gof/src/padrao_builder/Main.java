package padrao_builder;

//import padrao_builder.sem_usar_builder.BankAccount2;

public class Main {

	public static void main(String[] args) {

		// Sem o padrão Builder:
		/*
		 * BankAccount account_01 = new BankAccount("12345678900", "João da Silva",
		 * "001", 100000L); BankAccount account_02 = new BankAccount("12345678900",
		 * "Arthur Vinicius", "002", 200000L); BankAccount account_03 = new
		 * BankAccount("12345678900", "Agostinho Carrara", "003", 1000L);
		 */

		BankAccount account_01 = BankAccount
									.buildNewAccount()
									.withCpf("111.111.111-11")
									.withName("João da Silva")
									.withAgencyNumber("001")
									.withBalance(1000.0);
		
		System.out.println("> " + account_01.getName());
	}

}

