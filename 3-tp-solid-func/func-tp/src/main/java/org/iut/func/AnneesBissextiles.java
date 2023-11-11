package org.iut.func;

import java.time.Year;

public class AnneesBissextiles {
  public int depuis1900(int borneSup) {
    return borneSup >= 1900 ? (borneSup - 1900) / 4 : 0;
  }
}
