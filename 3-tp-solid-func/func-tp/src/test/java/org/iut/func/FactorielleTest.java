package org.iut.func;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorielleTest {
    Factorielle factorielle;

    @BeforeEach
    void setUp() {
        factorielle = new Factorielle();
    }

    /**
     * Test factorielle de 0
     */
    @Test
    void test_compute_fact0() {
        assertEquals(BigInteger.ONE, factorielle.compute(0));
    }

    /**
     * Test factorielle de 1
     */
    @Test
    void test_compute_fact1() {
        assertEquals(BigInteger.ONE, factorielle.compute(1));
    }

    /**
     * Test avec une borne supérieure de 0 (factorielle de 3)
     */
    @Test
    void test_compute_fact3() {
        assertEquals(BigInteger.valueOf(6), factorielle.compute(3));
    }

    /**
     * Test avec une borne supérieure de 0 (factorielle de 10)
     */
    @Test
    void test_compute_fact10() {
        assertEquals(BigInteger.valueOf(3628800), factorielle.compute(10));
    }

//    /**
//     * Test avec une borne inférieure de 0 (factorielle de -1)
//     */
//    @Test
//    void test_compute_factInferieur0() {
//        assertEquals(BigInteger.valueOf(-1), factorielle.compute(-1));
//    }
}