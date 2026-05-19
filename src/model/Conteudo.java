package model;

public abstract class Conteudo {

    //atributos
    private String titulo;
    private int duracao;
    private int classificacaoIndicativa;

    //método construtor
    public Conteudo(String titulo, int duracao, int classificacaoIndicativa){
        this.titulo = titulo;

        //validação da duração
        if(duracao > 0){
            this.duracao = duracao;
        }else{
            System.out.println("Tempo de duração inválido!");
        }

        //validação da classificação indicativa
        if(classificacaoIndicativa >= 0){
            this.classificacaoIndicativa = classificacaoIndicativa;
        }else{
            System.out.println("Classificação indicativa inválida!");
        }
    }

    //método abstrato
    public abstract void exibirDetalhes();

    //método
    public void reproduzir(){
        System.out.println("Reproduzindo conteúdo: " + titulo);
    }

    //métodos getters
    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public int getClassificacaoIndicativa(){
        return classificacaoIndicativa;
    }

    //métodos setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(int duracao){
        if(duracao > 0){
            this.duracao = duracao;
        }else{
            System.out.println("Tempo de duração inválido!");
        }
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa){
        if(classificacaoIndicativa >= 0){
            this.classificacaoIndicativa = classificacaoIndicativa;
        }else{
            System.out.println("Classificação indicativa inválida!");
        }
    }
}
