package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MusicCloud cloud = new MusicCloud();

    cloud.musicasDisponiveis.add("Musica 1");
    cloud.musicasDisponiveis.add("Musica 2");
    cloud.musicasDisponiveis.add("Musica 3");
    cloud.musicasDisponiveis.add("Musica 4");
    cloud.musicasDisponiveis.add("Musica 5");
    cloud.musicasDisponiveis.add("Musica 6");
    cloud.musicasDisponiveis.add("Musica 7");
    cloud.musicasDisponiveis.add("Musica 8");
    cloud.musicasDisponiveis.add("Musica 9");
    cloud.musicasDisponiveis.add("Musica 10");

    System.out.println("Digite o nome da playlist");
    String nomePlaylist = scanner.nextLine();

    Playlist playlist = new Playlist(nomePlaylist);

    while (true) {
      System.out.println("Digite o nome da música");
      String nomeMusica = scanner.nextLine();

      if (cloud.buscaMusica(nomeMusica) != null) {
        System.out.println("Digite o nome do artista");
        String nomeArtista = scanner.nextLine();

        playlist.musicas.add(new Musica(nomeMusica, nomeArtista));
      } else {
        System.out.println("Música não existe no Music Cloud");
      }

      System.out.println("Deseja adicionar outra música? (S/N)");
      String continuar = scanner.nextLine();

      if (!continuar.equalsIgnoreCase("S")) {
        break;
      }
    }

    System.out.println("Playlist: " + nomePlaylist);

    for (Musica musica : playlist.musicas) {
      System.out.println(musica.titulo + " - " + musica.artista);
    }
  }
}