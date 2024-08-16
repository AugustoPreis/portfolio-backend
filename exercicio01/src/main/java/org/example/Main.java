package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Filme> filmes = new ArrayList<Filme>();

        filmes.add(new Filme("Guardiões da Galáxia", "1", "1"));
        filmes.add(new Filme("Homem de Ferro 3", "1", "1"));
        filmes.add(new Filme("De Volta para o Futuro", "1", "1"));
        filmes.add(new Filme("Homens de Preto", "1", "1"));
        filmes.add(new Filme("As Aventuras de Bill & Ted", "1", "1"));
        filmes.add(new Filme("Interestelar", "1", "2"));
        filmes.add(new Filme("Blade Runner 2049", "1", "2"));
        filmes.add(new Filme("O Exterminador do Futuro", "1", "2"));
        filmes.add(new Filme("Matrix", "1", "2"));
        filmes.add(new Filme("Gravidade", "1", "2"));
        filmes.add(new Filme("Monty Python e o Cálice Sagrado", "2", "1"));
        filmes.add(new Filme("Coração de Cavaleiro", "2", "1"));
        filmes.add(new Filme("A Princesa Prometida", "2", "1"));
        filmes.add(new Filme("Shrek", "2", "1"));
        filmes.add(new Filme("Stardust - O Mistério da Estrela", "2", "1"));
        filmes.add(new Filme("Coração Valente", "2", "2"));
        filmes.add(new Filme("O Senhor dos Anéis: A Sociedade do Anel", "2", "2"));
        filmes.add(new Filme("Gladiador", "2", "2"));
        filmes.add(new Filme("Rei Arthur", "2", "2"));
        filmes.add(new Filme("O Nome da Rosa", "2", "2"));

        System.out.println("Que ambientação você prefere?");
        System.out.println("1 - Sci-fi");
        System.out.println("2 - Medieval");
        String ambientacao = scanner.nextLine();

        if (!ambientacao.equals("1") && !ambientacao.equals("2")) {
            return;
        }

        System.out.println("Que gênero você prefere");
        System.out.println("1 - Comédia");
        System.out.println("2 - Drama");
        String genero = scanner.nextLine();

        if (!genero.equals("1") && !genero.equals("2")) {
            return;
        }

        while (true) {
            int index = new Random().nextInt(0, filmes.size() - 1);

            Filme filme = filmes.get(index);

            if (filme.isCompativel(ambientacao, genero)) {
                System.out.println("Seu filme é: " + filme.nome);

                break;
            }
        }
    }
}