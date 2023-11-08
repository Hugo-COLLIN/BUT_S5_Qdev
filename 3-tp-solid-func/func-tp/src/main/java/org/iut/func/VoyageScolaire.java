package org.iut.func;

import java.util.Set;

public class VoyageScolaire {
  public boolean isMajeurObligatoire(Set<Personne> participants) {
    boolean obligatoire = true;

    if (participants.size() == 0) {
      obligatoire = false;
    } else {
      for (var participant : participants) {
        if (participant.age() >= 18) {
          obligatoire = false;
          break;
        }
      }
    }
    return obligatoire;
  }
}
