package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    public Conteudo() {
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

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
