package org.example;

import java.util.ArrayList;

public class MusicCloud {
   ArrayList<String> musicasDisponiveis;

   public MusicCloud(){
     this.musicasDisponiveis = new ArrayList<String>();
   }


   String buscaMusica(String titulo) {
      for (String musica : this.musicasDisponiveis) {
        if (musica.equalsIgnoreCase(titulo)) {
          return musica;
        }
      }

      return null;
   }
}
