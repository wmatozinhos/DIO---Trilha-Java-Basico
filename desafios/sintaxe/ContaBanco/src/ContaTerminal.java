import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da conta:");
        int numeroConta = Integer.valueOf(scanner.nextLine());

        System.out.println("Insira o número da agência com dígito (xxx-x):");
        String agencia = scanner.nextLine();

        System.out.println("Insira o nome completo do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o saldo da conta:");
        Double saldo;
        String saldoString = scanner.nextLine();
        try
        {
            saldo = Double.valueOf(saldoString);
        }
        catch(NumberFormatException exception)
        {
            saldo = Double.valueOf(saldoString.replace(".", "").replace(",", "."));
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
