package org.example;

import java.util.ArrayList;

public class Playlist {
  String nome;
  ArrayList<Musica> musicas;

  public Playlist(String nome){
    this.nome = nome;
    this.musicas = new ArrayList<Musica>();
  }
}