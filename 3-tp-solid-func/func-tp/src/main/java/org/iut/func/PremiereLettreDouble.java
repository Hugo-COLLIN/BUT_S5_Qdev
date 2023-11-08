package org.iut.func;

public class PremiereLettreDouble {
  public char findIn(String mot) {
    char[] lettres = mot.toCharArray();

    for (char lettreCandidate : lettres) {
      int count = 0;

      for (char lettre : lettres) {
        if (lettreCandidate == lettre) {
          count++;
        }
      }
      if (count > 1) {
        return lettreCandidate;
      }
    }
    return '\0';
  }
}
