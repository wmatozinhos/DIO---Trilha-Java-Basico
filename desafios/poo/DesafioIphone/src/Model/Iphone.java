package Model;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {

	private String musica = "música";

	public Iphone(String nome, String marca, String sistemaOperacional, int id) {
		super(nome, marca, sistemaOperacional, id);
	}

	public String getMusica() {
		return musica;
	}

	@Override
	public void selecionarMusica(String musica) {
    this.musica = musica;
    System.out.println("\n" + musica + " selecionada...");
	}

	@Override
	public void tocar() {
		System.out.println("\nTocando " + this.musica + " ...");
	}

	@Override
	public void pausar() {
        System.out.println("\nPausando " + this.musica + " ...");  	
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("\nExibindo a Página " + url + " ...");
	}

	@Override
	public void adicionarNovaAba() {
        System.out.println("\nAdicionando nova aba...");		
	}

	@Override
	public void atualizarPagina() {
        System.out.println("\nAtualizando página...");		
	}
	
	
    
	
	
	
	
}
