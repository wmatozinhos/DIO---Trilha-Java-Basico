package Controller;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informe o primeiro parâmetro:");
	int parametroUm = input.nextInt();
	
	System.out.println("\nInforme o segundo parâmetro:");
	int parametroDois = input.nextInt();
	
	
	try {
	contar(parametroUm, parametroDois);
	
	}catch(ParametrosInvalidosException e) {
		System.out.println("\nO segundo parâmetro deve ser maior que o primeiro!");
	 }
	
	input.close();
}
	
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois ) {throw new ParametrosInvalidosException();}else {
			
		int contagem = parametroDois - parametroUm;	
		
		   for(int i = 1; i <= contagem; i++) {
			   System.out.println("Imprimindo o número " + i);
		   }
		System.out.println("\nObtivemos " + contagem + " ocorrências!");
		   
		   
		}		
	}
	
	
}