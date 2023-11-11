package org.iut.func;

import java.util.Set;

public class VoyageScolaire {
  public boolean isMajeurObligatoire(Set<Personne> participants) {
    return !participants.isEmpty() &&
            participants.stream().noneMatch(p -> p.age() >= 18);
  }
}
