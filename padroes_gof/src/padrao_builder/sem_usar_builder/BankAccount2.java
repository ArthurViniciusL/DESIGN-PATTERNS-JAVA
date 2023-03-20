package padrao_builder.sem_usar_builder;

public class BankAccount2 {
	private String cpf;
	private String name;
	private String agencyNumber;
	private long balance;

	public BankAccount2(String cpf, String name, String agencyNumber, long balance) {
        this.cpf = cpf;
        this.name = name;
        this.agencyNumber = agencyNumber;
        this.balance = balance;
    }

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
