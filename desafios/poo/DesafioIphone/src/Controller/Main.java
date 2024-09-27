package Controller;

import Model.*;

public class Main {

	public static void main(String[] args) {
		
	Iphone iphoneDan = new Iphone("Iphone XR", "Apple", "IOS", 0001);
	
	iphoneDan.ligar("21 97728-0000");	
	iphoneDan.atender();
	iphoneDan.iniciarCorreioVoz();
	
	iphoneDan.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
	iphoneDan.adicionarNovaAba();
	iphoneDan.atualizarPagina();
	
	iphoneDan.selecionarMusica("twenty one pilots - Ride");
	iphoneDan.tocar();
	iphoneDan.pausar();	
	}
}
