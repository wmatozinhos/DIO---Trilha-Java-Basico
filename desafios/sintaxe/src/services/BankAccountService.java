package services;

import models.BankAccount;

public class BankAccountService {
	public void login(BankAccount account, int agencyInput) {
		if (account.getAccountNumber() == agencyInput) {
			System.out.println(account);
		} else {
			System.out.println("Login failed: incorrect account number");
		}
	}
}
