package org.example;

import org.example.Personagem;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    ArrayList<Personagem> inimigos = new ArrayList();
    Personagem personagem = new Personagem("Jogador", 5, 50);

    inimigos.add(new Personagem("Inimigo 1", 1, 10));
    inimigos.add(new Personagem("Inimigo 2", 2, 10));
    inimigos.add(new Personagem("Inimigo 3", 3, 10));

    while (true) {
      int randomIndex = (int)(Math.random() * inimigos.size());

      personagem.atacar(inimigos.get(randomIndex));

      if (inimigos.stream().allMatch((inimigo) -> inimigo.vida <= 0)) {
        break;
      }

      for (Personagem inimigo : inimigos) {
        inimigo.atacar(personagem);

        if (personagem.vida <= 0) {
          System.out.println("Jogador morreu");

          break;
        }
      }

      if (personagem.vida <= 0) {
        break;
      }
    }

    System.out.println("\nResultado final:\n");
    System.out.println(personagem.nome + " - " + personagem.vida);

    for (Personagem inimigo : inimigos) {
      System.out.println(inimigo.nome + " - " + inimigo.vida);
    }
  }
}