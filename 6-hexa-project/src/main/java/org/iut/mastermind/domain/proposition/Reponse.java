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
        return resultat.get(position);
    }

    // on construit le résultat en analysant chaque lettre
    // du mot proposé
    public void compare(String essai) {
//        position = 0;
        essai.chars().forEach(c -> {
            resultat.add(evaluationCaractere((char) c));
            position++;
        });
    }

    // si toutes les lettres sont placées
    public boolean lettresToutesPlacees() {
        position = 0;
        return motSecret.chars().allMatch(c -> {
            boolean isPlaced = estPlace((char) c);
            position++;
            return isPlaced;
        }) && resultat.stream().noneMatch(lettre -> lettre == Lettre.INCORRECTE);
    }



    public List<Lettre> lettres() {
        return unmodifiableList(resultat);
    }

    // renvoie le statut du caractère
    private Lettre evaluationCaractere(char carCourant) {
        return estPresent(carCourant) ?
                estPlace(carCourant) ? Lettre.PLACEE : Lettre.NON_PLACEE :
                Lettre.INCORRECTE;
    }

    // le caractère est présent dans le mot secret
    private boolean estPresent(char carCourant) {
        return motSecret.chars().anyMatch(c -> c == carCourant);
    }

    // le caractère est placé dans le mot secret
    private boolean estPlace(char carCourant) {
        return motSecret.charAt(position) == carCourant;
    }
}
