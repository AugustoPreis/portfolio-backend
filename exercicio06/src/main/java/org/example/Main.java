package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Cinema cinema = new Cinema();

    cinema.filmesDisponiveis.add(new Filme("Filme 1", 20, 18));
    cinema.filmesDisponiveis.add(new Filme("Filme 2", 15, 15));
    cinema.filmesDisponiveis.add(new Filme("Filme 3", 9, 12));
    cinema.filmesDisponiveis.add(new Filme("Filme 4", 7, 10));
    cinema.filmesDisponiveis.add(new Filme("Filme 5", 5, 0));

    while (true) {
      Ingresso ingresso = new Ingresso();

      System.out.println("Nome do cliente:");
      String nomeCliente = scanner.nextLine();

      System.out.println("Idade do cliente:");
      int idadeCliente = Integer.parseInt(scanner.nextLine());

      System.out.println("Nome do filme:");
      String nomeFilme = scanner.nextLine();

      System.out.println("Assento (A1 - F5):");
      String assento = scanner.nextLine();

      Cliente cliente = new Cliente(nomeCliente, idadeCliente);
      Filme filme = cinema.buscaFilme(nomeFilme);

      if (filme == null) {
        throw new Exception("Filme não encontrado");
      }

      if (filme.getIdadeMinima() > cliente.getIdade()) {
        throw new Exception("Idade mínima do filme maior que a do cliente");
      }

      if (!cinema.isAssentoDisponivel(assento, filme.getNome())) {
        throw new Exception("Assento não disponível");
      }

      ingresso.setCliente(cliente);
      ingresso.setFilme(filme);
      ingresso.setAssento(assento);

      cinema.ingressosVendidos.add(ingresso);

      System.out.println("Ingresso vendido com sucesso! Deseja adicionar outro? (S/N)");
      String adicionar = scanner.nextLine().toUpperCase();

      if (!adicionar.equals("S")) {
        break;
      }
    }
  }
}