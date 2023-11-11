package org.iut.func;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorielle {
  public BigInteger compute(long borneSup) {
      return LongStream
              .rangeClosed(1, borneSup)
              .mapToObj(BigInteger::valueOf)
              .reduce(BigInteger.ONE, BigInteger::multiply);
  }
}
