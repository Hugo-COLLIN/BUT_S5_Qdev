package org.iut.func;

import java.time.Year;

public class AnneesBissextiles {
  public int depuis1900(int borneSup) {
    int nbAnnees = 0;

    for (int i = 1900; i <= borneSup; i += 4) {
      if (Year.isLeap(i)) {
        nbAnnees++;
      }
    }
    return nbAnnees;
  }
}
