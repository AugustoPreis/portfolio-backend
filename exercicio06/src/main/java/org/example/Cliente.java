package org.example;

public class Cliente {
  String nome;
  int idade;

  public Cliente(String nome, int idade) {
    this.setNome(nome);
    this.setIdade(idade);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
