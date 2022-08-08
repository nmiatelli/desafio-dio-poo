package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // O static quer dizer que eu posso acessar o XP_Padrão fora dessa classe.
    // O protected faz com que as únicas classes que podem acessar sejam as classes filhas de Conteudo.
    protected static final double XP_Padrao = 10d;

    private String titulo;
    private String descricao;

    //Classe abstract: não consigo
    public abstract double calcularXp();

    /*Essa classe foi criada para que as classes filhas herdem o método,
    assim o código fica mais enxuto.*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
