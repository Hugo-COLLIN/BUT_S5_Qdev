package org.iut.mastermind.domain.proposition;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.unmodifiableList;

public class Reponse {
    private final String motSecret;
    private final List<Lettre> resultat = new ArrayList<>();
    private int position;

    public Reponse(String mot) {
        this.motSecret = mot;
    }

    // on récupère la lettre à la position dans le résultat
    public Lettre lettre(int position) {
        return null;
    }

    // on construit le résultat en analysant chaque lettre
    // du mot proposé
    public void compare(String essai) {
        // TBD
    }

    // si toutes les lettres sont placées
    public boolean lettresToutesPlacees() {
        return false;
    }

    public List<Lettre> lettres() {
        return unmodifiableList(resultat);
    }

    // renvoie le statut du caractère
    private Lettre evaluationCaractere(char carCourant) {
        return null;
    }

    // le caractère est présent dans le mot secret
    private boolean estPresent(char carCourant) {
        return false;
    }

    // le caractère est placé dans le mot secret
    private boolean estPlace(char carCourant) {
        return false;
    }
}
