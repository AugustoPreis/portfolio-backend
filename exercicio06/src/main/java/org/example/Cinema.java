package org.example;

import java.util.ArrayList;

public class Cinema {
  ArrayList<Filme> filmesDisponiveis;
  ArrayList<Ingresso> ingressosVendidos;

  public Cinema() {
    this.filmesDisponiveis = new ArrayList<Filme>();
    this.ingressosVendidos = new ArrayList<Ingresso>();
  }

  Filme buscaFilme(String nome) {
    for (Filme filme : this.filmesDisponiveis) {
      if (filme.getNome().equalsIgnoreCase(nome)) {
        return filme;
      }
    }

    return null;
  }

  boolean isAssentoDisponivel(String assento, String nomeFilme) {
    for (Ingresso ingresso : this.ingressosVendidos) {
      if (ingresso.getAssento().equalsIgnoreCase(assento)
          && ingresso.getFilme().getNome().equalsIgnoreCase(nomeFilme)) {
        return false;
      }
    }

    return true;
  }
}
