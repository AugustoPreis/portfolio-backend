package org.example.exercicio08.models;

public class Carro {
  public String marca;
  public String modelo;
  public String ano;

  public Carro(String marca, String modelo, String ano) {
    this.setMarca(marca);
    this.setModelo(modelo);
    this.setAno(ano);
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getAno() {
    return ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }
}