package org.example.exercicio08.controllers;

import org.example.exercicio08.models.Hash;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/hash")
public class HashController {

  @GetMapping("/generate")
  public String generate(
    @RequestParam(name = "length", required = true) String length,
    @RequestParam(name = "with_numbers", required = false) String with_numbers
  ) {
    Hash hash = new Hash(
      Integer.parseInt(length),
      Objects.equals(with_numbers, "true")
    );

    return hash.getValue();
  }
}
