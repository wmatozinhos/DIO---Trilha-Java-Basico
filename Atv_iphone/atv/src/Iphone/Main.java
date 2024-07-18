package Iphone;

import Aplicativo.Aparelhotelefonico;
import Aplicativo.NavegadorInternet;
import Aplicativo.ReprodutorMusical;
import Iphone.Iphone;



public class Main {
    public static void main(String[] args) {
        Iphone celular = new Iphone();


        ReprodutorMusical musical = celular;
        Aparelhotelefonico ligacao = celular;
        NavegadorInternet navweb = celular;

        System.out.println(" -----LIGACAO----- ");
        ligacao.ligar(" 619818181818 ");
        ligacao.atender();
        ligacao.iniciarCorreioVoz();

        System.out.println(" ----Tocar muscia---- ");
        musical.selecionarMusica(" Swedish House Mafia ft. Niki & The Dove - Lioness ");
        musical.tocar();
        musical.pausar();

        System.out.println("-----Navegar na web-----");
        navweb.exibirpagina(" https://www.porsche.com/brazil/pt/ ");
        navweb.adicionarNovaAba();
        navweb.atualizarPagina();

    }
}