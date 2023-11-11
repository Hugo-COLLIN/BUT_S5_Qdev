package org.iut.func;

public class PremiereLettreDouble {
  public char findIn(String mot) {
      return mot.chars()
              .mapToObj(c -> (char) c)
              .filter(c -> mot.indexOf(c) != mot.lastIndexOf(c)) // indexOf: 1ere occurence, lastIndexOf: dernière occurence
              .findFirst()
              .orElse('\0');
  }
}
