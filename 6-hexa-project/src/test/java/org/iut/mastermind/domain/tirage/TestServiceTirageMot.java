package org.iut.mastermind.domain.tirage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestServiceTirageMot {

    private static final int NB_MAX_MOTS = 3 ;
    private static final int MOT_NB = 2 ;
    @Mock
    private MotsRepository repository;

    @Mock
    private ServiceNombreAleatoire serviceNombreAleatoire;

    @BeforeEach
    void beforeEachTest() {
        when(repository.nbMaxMots()).thenReturn(NB_MAX_MOTS);
        when(repository.getMotByIndex(MOT_NB)).thenReturn("SUPER");
    }

    @Test
    void doitRenvoyerTirageMotAleatoire() {
        when(serviceNombreAleatoire.next(NB_MAX_MOTS)).thenReturn(MOT_NB);
        var selection = new ServiceTirageMot(repository, serviceNombreAleatoire);
        String tirage = selection.tirageMotAleatoire();
        assertThat(tirage).isEqualTo("SUPER");
    }
}
