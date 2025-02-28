import java.util.Scanner;

import models.BankAccount;
import services.BankAccountService;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BankAccount account = new BankAccount(1021, "067-8", "MARIO ANDRADE", 237.48);
		BankAccountService bankService = new BankAccountService();
		
		System.out.println("Por favor, digite o número da Agência !");
		String agencyInput = scanner.nextLine();
		
	
		bankService.login(account, Integer.parseInt(agencyInput));
		scanner.close();
	}
}