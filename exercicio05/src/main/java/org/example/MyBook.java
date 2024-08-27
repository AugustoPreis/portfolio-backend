package org.example;

public class MyBook implements PlataformaSocial {

  public void compartilharPostagem(Postagem postagem) {
    System.out.println("Você compartilhou a postagem " + postagem.getTitulo() + " no MyBook");
  }

  public void compartilharImagem(Postagem postagem) {
    System.out.println("Você compartilhou a imagem " + postagem.getTitulo() + " no MyBook");
  }

  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou o vídeo " + postagem.getTitulo() + " no MyBook");
  }
}