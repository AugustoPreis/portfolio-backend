package org.example;

public class Fotogram implements PlataformaSocial {

  public void compartilharPostagem(Postagem postagem) throws Exception {
    throw new Exception("Erro ao compartilhar postagem " + postagem.getTitulo() + " no Fotogram");
  }

  public void compartilharImagem(Postagem postagem) {
    System.out.println("Você compartilhou a imagem " + postagem.getTitulo() + " no Fotogram");
  }

  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou o vídeo " + postagem.getTitulo() + " no Fotogram");
  }
}