
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = Integer.parseInt(entrada.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");

        nomeCliente = entrada.nextLine();


        System.out.println("Por favor, digite o Saldo da Conta!");
        saldo = Double.parseDouble(entrada.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");


        entrada.close();

        
    }
}
