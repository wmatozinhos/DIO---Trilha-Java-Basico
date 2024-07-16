import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      // Criando os codigos para realizar o desafio
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = scanner.next();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta:");
        int number = scanner.nextInt();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco :)");
        System.out.println("Sua agência é: "+ agencia);
        System.out.println("Sua conta é: " + number);
        System.out.println("Seu saldo de: " + saldo + " já está disponível para saque.");
   }
}