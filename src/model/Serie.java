package model;

public class Serie extends Conteudo{

    private int temporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int duracao, int classificacaoIndicativa, int temporadas, int episodiosPorTemporada){
        super(titulo, duracao, classificacaoIndicativa);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Série: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Classificação: " + getClassificacaoIndicativa());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
    }

    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}
