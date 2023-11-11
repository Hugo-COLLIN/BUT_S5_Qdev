package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VoyageScolaireTest {
    
    VoyageScolaire voyageScolaire;

    @BeforeEach
    void setUp() {
        voyageScolaire = new VoyageScolaire();
    }

    /**
     * Test lorsqu'il n'y a aucun participant
     */
    @Test
    void test_isMajeurObligatoire_aucunParticipant() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of()));
    }
    
    /**
     * Test lorsqu'il y a un participant mineur
     */
    @Test
    void test_isMajeurObligatoire_unParticipantMineur() {
        assertTrue(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 17))));
    }
    
    /**
     * Test lorsqu'il y a un participant majeur
     */
    @Test
    void test_isMajeurObligatoire_unParticipantMajeur() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 18))));
    }
    
    /**
     * Test lorsqu'il y a un participant mineur et un participant majeur
     */
    @Test
    void test_isMajeurObligatoire_unParticipantMineur_unParticipantMajeur() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 17), new Personne("Dupont", 18))));
    }
    
    /**
     * Test lorsqu'il y a un participant mineur et deux participants majeurs
     */
    @Test
    void test_isMajeurObligatoire_unParticipantMineur_deuxParticipantsMajeurs() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 17), new Personne("Dupont", 18), new Personne("Dupont", 19))));
    }
    
    /**
     * Test lorsqu'il y a deux participants mineurs
     */
    @Test
    void test_isMajeurObligatoire_deuxParticipantsMineurs() {
        assertTrue(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 17), new Personne("Malrose", 17))));
    }
    
    /**
     * Test lorsqu'il y a deux participants mineurs et un participant majeur
     */
    @Test
    void test_isMajeurObligatoire_deuxParticipantsMineurs_unParticipantMajeur() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 17), new Personne("Malrose", 17), new Personne("Poirot", 18))));
    }
    
    /**
     * Test lorsqu'il y a deux participants majeurs
     */
    @Test
    void test_isMajeurObligatoire_deuxParticipantsMajeurs() {
        assertFalse(voyageScolaire.isMajeurObligatoire(Set.of(new Personne("Dupont", 18), new Personne("Malrose", 18))));
    }
    
}