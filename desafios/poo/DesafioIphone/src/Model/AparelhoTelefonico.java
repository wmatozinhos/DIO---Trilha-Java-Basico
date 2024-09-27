package Model;

public class AparelhoTelefonico {

	private String nome, marca, sistemaOperacional;
	private int id;
	
	
	public AparelhoTelefonico(String nome, String marca, String sistemaOperacional, int id) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSistemaOperacional() {
		return sistemaOperacional;
	}


	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	public void ligar(String numero) { System.out.println("\nLigando para " + numero + " ..."); }
	
	public void atender() { System.out.println("\nAtendendo Celular..."); }
	
	public void iniciarCorreioVoz() { System.out.println("\nIniciando o Correio de voz..."); }
	
}
