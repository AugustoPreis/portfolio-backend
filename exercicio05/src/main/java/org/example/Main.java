package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Postagem postagem = new Postagem();

    System.out.println("Informe o título da postagem");
    postagem.setTitulo(scanner.nextLine());

    System.out.println("Informe a descrição da postagem");
    postagem.setDescricao(scanner.nextLine());

    System.out.println("Informe o tipo da postagem");
    postagem.setTipo(scanner.nextLine().toLowerCase());

    MyBook myBook = new MyBook();
    myBook.compartilharPostagem(postagem);

    Fotogram fotogram = new Fotogram();
    fotogram.compartilharImagem(postagem);

    AnyTube anyTube = new AnyTube();
    anyTube.compartilharVideo(postagem);
  }
}