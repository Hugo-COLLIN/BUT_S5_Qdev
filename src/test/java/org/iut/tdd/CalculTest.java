package org.iut.tdd;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class CalculTest {

    @Test
    public void testAjoute() {
        var x = 10;
        var y = 5;
        var c = new Calcul();
        var resultat = c.somme(x,y);
        assertThat(resultat).isEqualTo(15);
    }

    @Test
    public void testAjouteDepassement() {
        var x = Integer.MAX_VALUE;
        var y = 1;
        var c = new Calcul();
        assertThatThrownBy(() -> c.somme(x,y))
                .isExactlyInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testAjouteOppose() {
        var x = 42;
        var y = -x;
        var c = new Calcul();
        var resultat = c.somme(x,y);
        assertThat(resultat).isEqualTo(0);
    }

    @Test
    public void testSoustrait() {
        var x = 10;
        var y = 5;
        var c = new Calcul();
        var resultat = c.difference(x,y);
        assertThat(resultat).isEqualTo(5);
    }

    @Test
    public void testMultiplie() {
        var x = 10;
        var y = 5;
        var c = new Calcul();
        var resultat = c.multiplication(x,y);
        assertThat(resultat).isEqualTo(50);
    }


}