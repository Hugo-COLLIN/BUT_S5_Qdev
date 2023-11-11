package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletDePythagoreTest {

    TripletDePythagore tripletDePythagore;

    @BeforeEach
    void setUp() {
        tripletDePythagore = new TripletDePythagore();
    }

    /**
     * Test avec des valeurs correctes pour m et n (m > n)
     */
    @Test
    void test_calculEuclide_ok() {
        assertEquals(new Triplet(3, 4, 5), tripletDePythagore.calculEuclide(2, 1));
    }

    /**
     * Test avec des valeurs incorrectes pour m et n (m < n)
     */
    @Test
    void test_calculEuclide_ko() {
        assertNotEquals(new Triplet(3, 4, 5), tripletDePythagore.calculEuclide(1, 2));
    }

    /**
     * Test avec des valeurs correctes pour m et n (m < n)
     */
    @Test
    void test_calculEuclide_ok2() {
        assertEquals(new Triplet(-3, 4, 5), tripletDePythagore.calculEuclide(1, 2));
    }

    /**
     * Test avec des valeurs incorrectes pour m et n (m > n)
     */
    @Test
    void test_calculEuclide_ko2() {
        assertNotEquals(new Triplet(-3, 4, 5), tripletDePythagore.calculEuclide(2, 1));
    }

    /**
     * Test lorsqu'il n'y a aucune valeur
     */
    @Test
    void test_compute_vide() {
        assertEquals(List.of(), tripletDePythagore.compute(0));
        assertEquals(0, tripletDePythagore.compute(0).size());
    }

    /**
     * Test lorsqu'il y a une seule valeur
     */
    @Test
    void test_compute_1Valeur() {
        assertEquals(List.of(new Triplet(3, 4, 5)), tripletDePythagore.compute(1));
        assertEquals(1, tripletDePythagore.compute(1).size());
    }

    /**
     * Test lorsqu'il y a plusieurs valeurs
     */
    @Test
    void test_compute_nValeurs() {
        assertEquals(List.of(new Triplet(3, 4, 5), new Triplet(8, 6, 10), new Triplet(5, 12, 13)), tripletDePythagore.compute(3));
        assertEquals(3, tripletDePythagore.compute(3).size());
    }
}