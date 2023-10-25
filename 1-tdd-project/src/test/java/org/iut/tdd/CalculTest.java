package org.iut.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


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

    @ParameterizedTest(name="{0} + {1} = {2}")
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "3, 4, 7"
    })
    public void testParametresCVS(int a, int b, int res) {
        Calcul calculatr = new Calcul();
        int result = calculatr.somme(a,b);
        assertEquals(res, result);
    }

    @ParameterizedTest(name="{0} + {1} = {2}")
    @MethodSource("generation")
    public void testParametresMethodes(int a, int b, int res) {
        Calcul calculatr = new Calcul();
        int result = calculatr.somme(a,b);
        assertEquals(res, result);
    }

    static Stream<Arguments> generation() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5),
                Arguments.of(3, 4, 7)
        );
    }


}