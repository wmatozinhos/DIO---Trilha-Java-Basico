import Apps.AparelhoTelefonico;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;
import Apps.relogio;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet, relogio{
   
    public void tocar() {
        System.out.println("Reproduzindo musica...");
    }

 
    public void pausar() {
        System.out.println("Musica pausada.");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    public void horario() {
        System.out.println("agora e 10:35 am");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

   
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

 
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

 
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }


    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine Dragons - believe");

        //Horario
        meuIphone.horario();
        
        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando NavegadorInternet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
