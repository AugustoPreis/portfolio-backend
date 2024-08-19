package org.example;

public class Personagem {
  String nome;
  int ataque;
  int vida;

  public Personagem(String nome, int ataque, int vida) {
    this.nome = nome;
    this.ataque = ataque;
    this.vida = vida;
  }

  public void receberDano(int dano) {
    this.vida = Math.max(this.vida - dano, 0);

    if (this.vida == 0) {
      System.out.println(this.nome + " foi derrotado");
    }
  }

  public void atacar(Personagem alvo) {
    if (alvo.vida == 0) {
      System.out.println("Ataque falhou");
    }

    alvo.receberDano(this.ataque);
  }
}