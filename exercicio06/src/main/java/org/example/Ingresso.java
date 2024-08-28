package org.example;

public class Ingresso {
  Cliente cliente;
  Filme filme;
  String assento;

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Filme getFilme() {
    return this.filme;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public String getAssento() {
    return this.assento;
  }

  public void setAssento(String assento) {
    this.assento = assento;
  }
}
