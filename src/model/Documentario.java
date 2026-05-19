package model;

public class Documentario extends Conteudo{

    private String tema;

    public Documentario(String titulo, int duracao, int classificacaoIndicativa, String tema){
        super(titulo, duracao, classificacaoIndicativa);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Documentário: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Classificação: " + getClassificacaoIndicativa());
        System.out.println("Tema: " + tema);
    }

    public String getTema(){
        return tema;
    }

    public void setTema(String tema){
        this.tema = tema;
    }
}