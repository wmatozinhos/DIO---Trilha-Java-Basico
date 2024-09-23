package Controller;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	@SuppressWarnings("resource")	   
	Scanner input = new Scanner(System.in);
	
	System.out.println("Olá, por favor, informe seu nome: ");
	String nomeCLiente = input.nextLine();
	
	System.out.println("\nInforme sua agência:");
	String agencia = input.nextLine();
	
	System.out.println("\nInforme o número da conta:");
	int numeroConta = input.nextInt();
	
	System.out.println("\nPor último, informe o seu saldo:");
	double saldo = input.nextDouble();
	
	System.out.println("\nOlá " + nomeCLiente + ", obrigado por criar um conta em nosso banco, sua agência é a (" + agencia + "), sua conta a (" + numeroConta + ") e seu saldo de " + saldo + "R$ já está disponível para saque!");
	
	
		
		
		
		
	}
}
