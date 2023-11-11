package org.iut.func;

import java.util.List;
import java.util.stream.Stream;

import static org.iut.func.Triplet.triplet;

public class TripletDePythagore {
  public Triplet calculEuclide(int m, int n) {
    return triplet(
      m * m - n * n,
      2 * m * n,
      m * m + n * n
    );
  }

  public List<Triplet> compute(int nbValeurs) {
     return Stream.iterate(2, m -> m + 1)
       .flatMap(m -> Stream.iterate(1, n -> n + 1)
         .limit(m - 1)
         .map(n -> calculEuclide(m, n)))
       .limit(nbValeurs)
       .toList();
  }
}
