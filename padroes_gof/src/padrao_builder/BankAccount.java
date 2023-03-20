package padrao_builder;

public class BankAccount {

	private String cpf;
	private String name;
	private String agencyNumber;
	private double balance;

	// Construtor da classe
	private BankAccount() {
		// TODO
	}

	// Método de construção do objeto
	public static BankAccount buildNewAccount() {
		return new BankAccount();
	}

	// Atributos:

	public BankAccount withCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public BankAccount withName(String name) {
		this.name = name;
		return this;
	}

	public BankAccount withAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
		return this;
	}

	public BankAccount withBalance(double balance) {
		this.balance = balance;
		return this;
	}

	// Getters and Setters:

	public String getCpf() {
		return cpf;
	}

	public String getName() {
		return name;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}

	public double getBalance() {
		return balance;
	}
}
