package org.example;

import java.util.ArrayList;

public class BasePorto {
  public String nome;
  public ArrayList<Barco> barcosAtracados = new ArrayList<Barco>();

  public void atracarBarco(Barco barco) {
    this.barcosAtracados.add(barco);
  }

  public void desatracarBarco(Barco barco) {
    this.barcosAtracados.remove(barco);
  }
}
