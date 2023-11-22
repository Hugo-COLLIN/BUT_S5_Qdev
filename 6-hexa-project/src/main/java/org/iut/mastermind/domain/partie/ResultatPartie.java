package org.iut.mastermind.domain.partie;

import org.iut.mastermind.domain.proposition.Reponse;

public record ResultatPartie(Reponse resultat, boolean isTermine, boolean isError) {
    public static final ResultatPartie ERROR = new ResultatPartie(null, true, true);

    public static ResultatPartie create(Reponse resultat, boolean isTermine) {
        return new ResultatPartie(resultat, isTermine, false);
    }
}
