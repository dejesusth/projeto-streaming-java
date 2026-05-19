package app;

import model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //criação de conteúdos
        Filme filme1 = new Filme("Titanic",194,14,"Drama");

        Serie serie1 = new Serie("Breaking Bad",50,18,5,13);

        Documentario documentario1 = new Documentario("Human",191,12,"Não-Ficcional");

        //exibição de conteúdos
        System.out.println("=== DETALHES ===");

        filme1.exibirDetalhes();
        System.out.println("-------------------");

        serie1.exibirDetalhes();
        System.out.println("-------------------");

        documentario1.exibirDetalhes();
        System.out.println("-------------------");

        //reprodução dos conteúdos
        System.out.println("=== REPRODUÇÃO ===");

        filme1.reproduzir();

        serie1.reproduzir();

        documentario1.reproduzir();

        System.out.println("-------------------");

        //criação do usuário
        Usuario usuario1 = new Usuario("Thiago", "thiago@email.com");

        //adicionando aos favoritos
        System.out.println("=== FAVORITOS ===");

        usuario1.adicionarFavorito(filme1);

        usuario1.adicionarFavorito(serie1);

        usuario1.adicionarFavorito(documentario1);

        System.out.println("-------------------");

        //mostrando favoritos
        usuario1.mostrarfavoritos();

        System.out.println("-------------------");

        //exibir catálogo completo
        System.out.println("=== CATÁLOGO COMPLETO ===");

        ArrayList<Conteudo> catalogo = new ArrayList<>();

        catalogo.add(filme1);
        catalogo.add(serie1);
        catalogo.add(documentario1);

        for (Conteudo conteudo : catalogo){
            conteudo.exibirDetalhes();
            System.out.println("-------------------");
        }
    }
}