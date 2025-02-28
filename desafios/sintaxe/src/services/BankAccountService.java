package services;

import models.BankAccount;

public class BankAccountService {
	public void login(BankAccount account, String agencyInput) {
		try {
			int agencyNumber = Integer.parseInt(agencyInput);

			if (account.getAccountNumber() != agencyNumber) {
				throw new NumberFormatException("Login failed: incorrect account number");
			}

			System.out.println(account);
		} catch (NumberFormatException e) {
			System.out.println("Login failed: incorrect account number");
		}

	}
}
