package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnneesBissextilesTest {
    AnneesBissextiles anneesBissextiles;

    @BeforeEach
    void setUp() {
        anneesBissextiles = new AnneesBissextiles();
    }

    /**
     * Test avec une borne supérieure de 1900 (aucune année bissextile)
     */
    @Test
    void test_depuis1900_nonBissextile() {
        assertEquals(0, anneesBissextiles.depuis1900(1901));
    }

    /**
     * Test avec une borne supérieure de 1904 (une année bissextile)
     */
    @Test
    void test_depuis1900_bissextile() {
        assertEquals(1, anneesBissextiles.depuis1900(1904));
    }

    /**
     * Test avec une borne supérieure de 2000 (25 années bissextiles)
     */
    @Test
    void test_depuis1900_25Bissextiles() {
        assertEquals(25, anneesBissextiles.depuis1900(2000));
    }

    /**
     * Test avec une borne inférieure à 1900 (aucune année bissextile)
     */
    @Test
    void test_depuis1900_inferieur1900() {
        assertEquals(0, anneesBissextiles.depuis1900(1890));
    }

}