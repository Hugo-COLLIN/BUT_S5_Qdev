package org.iut.mastermind.domain.partie;

import java.util.Optional;

public interface PartieRepository {
    void create(Partie partie);

    Optional<Partie> getPartieEnregistree(Joueur joueur);

    void update(Partie partie);
}
