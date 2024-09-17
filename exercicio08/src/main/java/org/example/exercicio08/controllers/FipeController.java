package org.example.exercicio08.controllers;

import org.example.exercicio08.models.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class FipeController {
  private RestClient restClient = RestClient.create();

  @PostMapping("/fipe")
  public String fipe(@RequestBody Carro carro) {
    String uri = "https://parallelum.com.br/fipe/api/v1/carros/marcas/";

    if (carro.getMarca() != null) {
      uri = uri + carro.getMarca() + "/modelos/";

      if (carro.getModelo() != null) {
        uri = uri + carro.getModelo() + "/anos/";

        if (carro.getAno() != null) {
          uri = uri + carro.getAno();
        }
      }
    }

    return restClient
            .get()
            .uri(uri)
            .retrieve()
            .body(String.class);
  }
}
