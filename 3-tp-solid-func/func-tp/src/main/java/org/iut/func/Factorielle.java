package org.iut.func;

import java.math.BigInteger;

public class Factorielle {
  public BigInteger compute(long borneSup) {
    BigInteger resultat = BigInteger.ONE;

    for (int i = 1; i <= borneSup; i++) {
      resultat = resultat.multiply(BigInteger.valueOf(i));
    }
    return resultat;
  }
}
