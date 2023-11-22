package org.iut.mastermind.domain.partie;

import org.iut.mastermind.domain.Mastermind;
import org.iut.mastermind.domain.proposition.Lettre;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestPartie {
    private static final Joueur JOUEUR = new Joueur("Alice");
    private static final String MOT_CORRECT = "SOLID";
    private static final String MOT_INCORRECT = "DXXXX";
    @Mock
    private PartieRepository partieRepository;
    @InjectMocks
    private Mastermind mastermind;

    @Test
    void doitRenvoyerResultatPourLaProposition() {
        givenPartieEnregistree(Partie.create(JOUEUR, MOT_CORRECT));
        ResultatPartie res = mastermind.evaluation(JOUEUR, MOT_INCORRECT);
        Lettre premiereLettre = res.resultat().lettre(0);
        assertThat(premiereLettre).isEqualTo(Lettre.NON_PLACEE);
    }

    @Test
    void doitMettreAJourNombreEssais() {
        givenPartieEnregistree(Partie.create(JOUEUR, MOT_CORRECT));
        mastermind.evaluation(JOUEUR, MOT_INCORRECT);
        var partie = getPartieMAJDansRepository();
        assertThat(partie.getNbEssais()).isEqualTo(1);
    }

    @Test
    void doitTerminerLaPartieQuandNombreEssaisDepasse(){
        int nbEssaiMax = 5;
        givenPartieEnregistree(Partie.create(JOUEUR, MOT_CORRECT, nbEssaiMax-1));
        ResultatPartie result = mastermind.evaluation(JOUEUR, MOT_INCORRECT);
        assertThat(result.isTermine()).isTrue();
    }

    @Test
    void doitLeverErreurQuandJeuTermine(){
        var partie = Partie.create(JOUEUR, MOT_CORRECT);
        partie.done();
        givenPartieEnregistree( partie );
        ResultatPartie result = mastermind.evaluation(JOUEUR, MOT_INCORRECT);
        assertThat(result.isError()).isTrue();
    }

    @Test
    void doitEnregistrerPartieQuandVictoire(){
        givenPartieEnregistree(Partie.create(JOUEUR, MOT_CORRECT));
        mastermind.evaluation(JOUEUR, MOT_CORRECT);
        Partie partie = getPartieMAJDansRepository();
        assertThat(partie.isTerminee()).isTrue();
    }

    private Partie getPartieMAJDansRepository() {
        ArgumentCaptor<Partie> argument = ArgumentCaptor.forClass(Partie.class);
        verify(partieRepository).update(argument.capture());
        return argument.getValue();
    }

    private void givenPartieEnregistree(Partie partie) {
        when(partieRepository.getPartieEnregistree(eq(JOUEUR)))
                .thenReturn(Optional.of(partie));
    }
}
