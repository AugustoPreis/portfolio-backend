package org.example.exercicio07.controllers;

import org.example.exercicio07.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmeController {

  @GetMapping("/recomendar")
  public String recomendar(
    @RequestParam(value = "genero", required = true) String genero,
    @RequestParam(value = "ambiente", required = true) String ambiente
  ) {
    List<Filme> filmes = new ArrayList<Filme>();

    filmes.add(new Filme("Guardiões da Galáxia", "scifi", "comedia"));
    filmes.add(new Filme("Interestelar", "scifi", "drama"));
    filmes.add(new Filme("Monty Python e o Cálice Sagrado", "medieval", "comedia"));
    filmes.add(new Filme("Coração Valente", "medieval", "drama"));

    for (Filme filme : filmes) {
      if (filme.isCompativel(ambiente, genero)) {
        return filme.getNome();
      }
    }

    return "Nenhum filme encontrado";
  }
}
