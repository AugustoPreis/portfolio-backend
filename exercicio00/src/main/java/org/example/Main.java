package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    while (true) {
      int numero = random.nextInt(10, 99);
      String[] times = {
        "Criciuma", "Vasco", "Corinthians", "Gremio", "Inter", "Palmeiras",
        "Flamengo", "Santos", "Bahia", "Fluminense", "Atletico", "Curitiba"
      };
      String time = times[random.nextInt(times.length)];
      String nome;
      String sobrenome;

      System.out.println("Digite o nome:");
      nome = scanner.nextLine();

      if (nome.isEmpty()) {
        return;
      }

      System.out.println("Digite o sobrenome:");
      sobrenome = scanner.nextLine();

      System.out.println("Nome de usuário: " + nome + sobrenome + time + numero);
    }
  }
}