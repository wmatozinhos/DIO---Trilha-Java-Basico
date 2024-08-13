import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (InputInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    
    public static void contar(int parametroUm, int parametroDois ) throws InputInvalidosException {
        if(parametroUm > parametroDois) throw new InputInvalidosException();

        int contagem = parametroDois - parametroUm;
        for(int i=1; i<= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}