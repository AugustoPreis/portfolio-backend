package org.example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Barco> barcos = new ArrayList<Barco>();
    PortoPequeno portoPequeno = new PortoPequeno();
    PortoGrande portoGrande = new PortoGrande();

    barcos.add(new Barco("Barco 1", 2));
    barcos.add(new Barco("Barco 2", 5));
    barcos.add(new Barco("Barco 3", 7));
    barcos.add(new Barco("Barco 4", 12));
    barcos.add(new Barco("Barco 5", 20));

    for (Barco barco : barcos) {
      if (barco.tamanho <= 10) {
        portoPequeno.barcosAtracados.add(barco);
        System.out.println(barco.nome + " atracado no porto pequeno");
      } else {
        portoGrande.barcosAtracados.add(barco);
        System.out.println(barco.nome + " atracado no porto grande");
      }
    }
  }
}