package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {
    Personne personne;

    @BeforeEach
    void setUp() {
        personne = new Personne("John", 18);
    }

    @Test
    void nom() {
        assertEquals("John", personne.nom());
    }

    @Test
    void age() {
        assertEquals(18, personne.age());
    }
}