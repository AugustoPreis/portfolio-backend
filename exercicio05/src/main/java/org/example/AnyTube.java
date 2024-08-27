package org.example;

public class AnyTube implements PlataformaSocial {

  public void compartilharPostagem(Postagem postagem) throws Exception {
    throw new Exception("Erro ao compartilhar postagem " + postagem.getTitulo() + " no AnyTube");
  }

  public void compartilharImagem(Postagem postagem) throws Exception {
    throw new Exception("Erro ao compartilhar imagem " + postagem.getTitulo() + " no AnyTube");
  }

  public void compartilharVideo(Postagem postagem) {
    System.out.println("Você compartilhou o vídeo " + postagem.getTitulo() + " no AnyTube");
  }
}