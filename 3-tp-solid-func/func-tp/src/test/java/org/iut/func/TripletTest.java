package org.iut.func;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletTest {
    static Triplet triplet;

    @BeforeAll
    static void setUp() {
        triplet = new Triplet(3, -4, 5);
    }

    @Test
    void triplet() {
        assertEquals(3, triplet.a());
        assertEquals(-4, triplet.b());
        assertEquals(5, triplet.c());
    }

    @Test
    void test_toString() {
        assertEquals("3 -4 5", triplet.toString());
    }

    @Test
    void a() {
        assertEquals(3, triplet.a());
    }

    @Test
    void b() {
        assertEquals(-4, triplet.b());
    }

    @Test
    void c() {
        assertEquals(5, triplet.c());
    }
}