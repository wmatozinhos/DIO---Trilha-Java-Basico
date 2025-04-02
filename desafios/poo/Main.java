public class Main {
    public static void main(String[] args) {
        // Corrigido para usar "IPhone" e passar os parâmetros corretamente
        IPhone meuIphone = new IPhone("iPhone 14", "iOS 16.4");

        // Testando o Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}