package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiereLettreDoubleTest {
    PremiereLettreDouble premiereLettreDouble;

    @BeforeEach
    void setUp() {
        premiereLettreDouble = new PremiereLettreDouble();
    }

    /**
     * Mot avec une seule lettre
     */
    @Test
    void test_findIn_mot1Lettre() {
        assertEquals('\0', premiereLettreDouble.findIn("a"));
    }

    /**
     * Mot avec deux lettres identiques
     */
    @Test
    void test_findIn_mot2LettresIdentiques() {
        assertEquals('a', premiereLettreDouble.findIn("aa"));
    }

    /**
     * Mot avec deux lettres différentes
     */
    @Test
    void test_findIn_mot2LettresDifferentes() {
        assertEquals('\0', premiereLettreDouble.findIn("ab"));
    }

    /**
     * Mot avec trois lettres identiques
     */
    @Test
    void test_findIn_mot3LettresIdentiques() {
        assertEquals('a', premiereLettreDouble.findIn("aaa"));
    }

    /**
     * Mot avec trois lettres différentes
     */
    @Test
    void test_findIn_mot3LettresDifferentes() {
        assertEquals('\0', premiereLettreDouble.findIn("abc"));
    }

    /**
     * Mot de plusieurs lettres dont deux identiques non-consécutives
     */
    @Test
    void test_findIn_mot3Lettres2Identiques() {
        assertEquals('a', premiereLettreDouble.findIn("aba"));
    }

    /**
     * Mot de plusieurs lettres dont deux identiques consécutives
     */
    @Test
    void test_findIn_mot3Lettres2IdentiquesConsecutives() {
        assertEquals('a', premiereLettreDouble.findIn("aab"));
    }
}