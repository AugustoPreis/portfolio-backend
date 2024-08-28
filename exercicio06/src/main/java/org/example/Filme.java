package org.example;

public class Filme {
  String nome;
  double preco;
  int idadeMinima;

  public Filme(String nome, double preco, int idadeMinima) {
    this.setNome(nome);
    this.setPreco(preco);
    this.setIdadeMinima(idadeMinima);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getIdadeMinima() {
    return this.idadeMinima;
  }

  public void setIdadeMinima(int idadeMinima) {
    this.idadeMinima = idadeMinima;
  }
}
