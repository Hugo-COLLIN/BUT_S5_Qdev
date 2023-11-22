package org.iut.mastermind.domain.proposition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.iut.mastermind.domain.proposition.Lettre.*;

public class TestProposition {
    @Test
    public void casLettreIncorrecte() {
        var mot = new MotSecret("S");
        var reponse = mot.compareProposition("Z");
        assertResultat(reponse, INCORRECTE);
    }

    @Test
    public void casLettrePlacee() {
        var mot = new MotSecret("S");
        var reponse = mot.compareProposition("S");
        assertResultat(reponse, PLACEE);
    }

    @Test
    public void casDeuxiemeLettreMalPlacee() {
        var mot = new MotSecret("SO");
        var reponse = mot.compareProposition("ZS");
        assertResultat(reponse,  INCORRECTE, NON_PLACEE);
    }

    @Test
    public void casCombinaisons() {
        var mot = new MotSecret("SOL");
        var reponse = mot.compareProposition("ZSL");
        assertResultat(reponse,  INCORRECTE, NON_PLACEE, PLACEE);
    }

    @Test
    void casToutesLettresPlacees() {
        var mot = new MotSecret("SOLID");
        var reponse = mot.compareProposition("SOLID");
        assertThat(reponse.lettresToutesPlacees()).isTrue();
    }

    @Test
    void casLettresIncorrectes() {
        var mot = new MotSecret("SOLID");
        var reponse = mot.compareProposition("SOL*D");
        assertThat(reponse.lettresToutesPlacees()).isFalse();
    }

    @Test
    void casAccesLettres() {
        var mot = new MotSecret("SOLID");
        var reponse = mot.compareProposition("SOL*D");
        assertThat(reponse.lettres()).hasSize(5);
    }


    private void assertResultat(Reponse reponse, Lettre... resultatAttendu) {
        for (int position = 0; position < resultatAttendu.length; position++) {
            Lettre attendue = resultatAttendu[position];
            assertThat(reponse.lettre(position)).isEqualTo(attendue);
        }
    }
}
