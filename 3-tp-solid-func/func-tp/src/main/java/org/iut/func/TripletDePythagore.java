package org.iut.func;

import java.util.List;
import java.util.ArrayList;
import static org.iut.func.Triplet.triplet;

record Triplet(int a, int b, int c) {
  public static Triplet triplet(int a, int b, int c) {
    return new Triplet(a, b, c);
  }

  public String toString() {
    return String.format("%d %d %d", a, b, c);
  }
}

public class TripletDePythagore {
  public Triplet calculEuclide(int m, int n) {
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;
    return triplet(a, b, c);
  }

  public List<Triplet> compute(int nbValeurs) {
    if (nbValeurs == 0) {
      return List.of();
    }

    List<Triplet> triplets = new ArrayList<>();
    int index = 1;

    for (int m = 2;; m++) {
      for (int n = 1; n < m; n++) {
        triplets.add(calculEuclide(m, n));
        index++;
        if (index > nbValeurs)
          break;
      }
      if (index > nbValeurs)
        break;
    }
    return triplets;
  }
}
