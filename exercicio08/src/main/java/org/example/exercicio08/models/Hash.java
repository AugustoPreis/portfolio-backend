package org.example.exercicio08.models;

import java.util.Random;

public class Hash {
  private String value;

  public Hash(int length, boolean withNumbers) {
    this.setValue(this.generate(length, withNumbers));
  }

  private String generate(int length, boolean withNumbers) {
    String chars = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
    StringBuilder hash = new StringBuilder(length);
    Random random = new Random();

    if (withNumbers) {
      chars = chars.concat("0123456789");
    }

    for (int i = 0; i < length; i++) {
      int index = random.nextInt(chars.length());

      hash.append(chars.charAt(index));
    }

    return hash.toString();
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
