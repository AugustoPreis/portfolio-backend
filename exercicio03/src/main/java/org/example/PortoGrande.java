package org.example;

public class PortoGrande extends BasePorto {

  public void atracarBarco(Barco barco) {
    if (barco.tamanho < 10) {
      return;
    }

    this.barcosAtracados.add(barco);
  }
}
