package org.example.exercicio07.models;

public class Filme {
  public String nome;
  private String ambientacao;
  private String genero;

  public Filme(String nome, String ambientacao, String genero) {
    this.setNome(nome);
    this.setAmbientacao(ambientacao);
    this.setGenero(genero);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAmbientacao() {
    return ambientacao;
  }

  public void setAmbientacao(String ambientacao) {
    this.ambientacao = ambientacao;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public boolean isCompativel(String ambientacao, String genero) {
    return this.ambientacao.equals(ambientacao) && this.genero.equals(genero);
  }
}