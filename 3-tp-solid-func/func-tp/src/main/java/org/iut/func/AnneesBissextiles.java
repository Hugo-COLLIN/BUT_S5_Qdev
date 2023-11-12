package org.iut.func;

import java.time.Year;
import java.util.stream.IntStream;

public class AnneesBissextiles {
  public int depuis1900(int borneSup) {
     return (int) IntStream.rangeClosed(1900, borneSup) // [1900, borneSup]
       .filter(annee -> Year.of(annee).isLeap())
       .count();
  }
}
