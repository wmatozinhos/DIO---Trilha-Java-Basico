public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private Musica[] musicas;
    private Contato[] contatos;
    private String url;

    public Iphone() {
        musicas = new Musica[10];
        contatos = new Contato[50];
    }

    @Override
    public void ligar(String contatos) {
        System.out.println("Ligando para " + contatos[17]);
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligacao ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correrio de voz");
    }

    @Override
    public void exibirpagina(String url) {
        System.out.println("exibindo pagina " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausar musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica" + musica[3]);
    }
}