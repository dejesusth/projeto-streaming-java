package model;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;
    private ArrayList<Conteudo> favoritos;

    //método construtor
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        favoritos = new ArrayList<>();
    }

    //adicionar aos favoritos
    public void adicionarFavorito(Conteudo conteudo){
        favoritos.add(conteudo);
        System.out.println(conteudo.getTitulo() + " foi adicionado aos favoritos!");
    }

    //lista dos favoritos
    public void mostrarfavoritos(){
        System.out.println("Favoritos de " + nome + ":");
        for(Conteudo conteudo : favoritos){
            conteudo.exibirDetalhes();
            System.out.println("-------------------");
        }
    }

    //reproduzir conteúdo
    public void reproduzirConteudo(Conteudo conteudo){
        conteudo.reproduzir();
    }

    //métodos getters
    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public ArrayList<Conteudo> getFavoritos(){
        return favoritos;
    }

    //métodos setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
}