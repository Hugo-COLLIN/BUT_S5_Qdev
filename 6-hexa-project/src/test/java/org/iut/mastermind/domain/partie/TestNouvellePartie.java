package org.iut.mastermind.domain.partie;

import org.iut.mastermind.domain.Mastermind;
import org.iut.mastermind.domain.tirage.MotsRepository;
import org.iut.mastermind.domain.tirage.ServiceNombreAleatoire;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestNouvellePartie {
    private static final Joueur JOUEUR = new Joueur("Alice");
    private static final String MOT_CORRECT = "SOLID";
    @Mock
    private PartieRepository partieRepository;
    @Mock
    private MotsRepository motsRepository;
    @Mock
    private ServiceNombreAleatoire nombreAleatoire;
    @InjectMocks
    private Mastermind mastermind;

    @Test
    void doitInitialiserNouvellePartie() {
        givenMotSelectionne(MOT_CORRECT);
        mastermind.nouvellePartie(JOUEUR);
        Partie partie = getPartieEnregistree();
        assertThat(partie.getMot()).isEqualTo(MOT_CORRECT);
        assertThat(partie.getNbEssais()).isZero();
        assertThat(partie.getJoueur()).isSameAs(JOUEUR);
    }

    @Test
    void nePeutPasRedemarrerUnePartie() {
        when(partieRepository
                .getPartieEnregistree(eq(JOUEUR)))
                .thenReturn(Optional.of(Partie.create(JOUEUR, MOT_CORRECT)));
        var succes = mastermind.nouvellePartie(JOUEUR);
        assertThat(succes).isFalse();
    }
    private void givenMotSelectionne(String motSelectionne) {
        int motNumero = 2;
        when(nombreAleatoire.next(anyInt()))
                .thenReturn(motNumero);
        when(motsRepository
                .getMotByIndex(motNumero))
                .thenReturn(motSelectionne);
    }

    private Partie getPartieEnregistree() {
        var argPartie = ArgumentCaptor.forClass(Partie.class);
        verify(partieRepository)
                .create(argPartie.capture());
        var partie = argPartie.getValue();
        return partie;
    }
}

