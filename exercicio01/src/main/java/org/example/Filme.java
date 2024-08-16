package org.example;

public class Filme {
    public String nome;
    private String ambientacao;
    private String genero;

    public Filme(String nome, String ambientacao, String genero) {
        this.nome = nome;
        this.ambientacao = ambientacao;
        this.genero = genero;
    }

    public boolean isCompativel(String ambientacao, String genero) {
        return this.ambientacao.equals(ambientacao) && this.genero.equals(genero);
    }
}