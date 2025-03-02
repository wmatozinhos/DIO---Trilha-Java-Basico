package models;

public class BankAccount {
	private int accountNumber;
	private String agency;
	private String clientName;
	private double balance;

	public BankAccount(int accountNumber, String agency, String clientName, double balance) {
		this.accountNumber = accountNumber;
		this.agency = agency;
		this.clientName = clientName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return String.format(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.",
				clientName, agency, accountNumber, balance);
	}
}
