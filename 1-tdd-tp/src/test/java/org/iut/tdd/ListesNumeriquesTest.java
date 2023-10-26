package org.iut.tdd;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Tests unitaires pour la classe ListesNumeriques
 */
class ListesNumeriquesTest {

    /**
     * Les listes utilisées pour les tests
     */
    List<Integer> l1, l2, lRes;

    /**
     * La classe à tester
     */
    ListesNumeriques listesNumeriques;

    /**
     * Initialisation des variables avant chaque test
     */
    @BeforeEach
    void setUp() {
        listesNumeriques = new ListesNumeriques();

        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        lRes = new ArrayList<>();
    }

    /**
     * Teste la méthode ajoute dans le cas où les listes sont correctes
     */
    @Test
    void testAjouteOk() {
        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(3);

        lRes.add(4);
        lRes.add(5);
        assertEquals(lRes, listesNumeriques.ajoute(l1, l2));
    }

    /**
     * Teste la méthode ajoute dans le cas où l'un des éléments de la liste est supérieur à 9
     */
    @Test
    void testAjouteThrowsException() {
        l1.add(0, 1);
        l1.add(0, 2);
        l2.add(0, 3);
        l2.add(0, 10);
        l2.add(0, 3);

        assertThatThrownBy(() -> listesNumeriques.ajoute(l1, l2))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    /**
     * Teste la méthode ajoute dans le cas où l'une des listes est null
     */
    @Test
    void testAjouteNull() {
        l1.add(0, 1);
        l1.add(0, 2);

        assertNull(listesNumeriques.ajoute(l1, null));
        assertNull(listesNumeriques.ajoute(null, l1));
    }

    /**
     * Teste la méthode ajoute dans le cas où l'une des listes est vide
     */
    @Test
    void testAjouteEmpty() {
        l1.add(0, 1);
        l1.add(0, 2);

        assertEquals(l1, listesNumeriques.ajoute(l1, new ArrayList<>()));
        assertEquals(l1, listesNumeriques.ajoute(new ArrayList<>(), l1));
    }

//    /**
//     * Teste la méthode ajoute dans le cas où les listes sont vides
//     */
//    @Test
//    void testAjouteNoCarry() {
//        l1.add(1);
//        l1.add(2);
//        l2.add(2);
//        l2.add(3);
//
//        lRes.add(3);
//        lRes.add(5);
//        assertEquals(lRes, listesNumeriques.ajoute(l1, l2));
//    }

    /**
     * Teste la méthode ajoute dans le cas où on a une retenue à la fin
     */
    @Test
    void testAjouteWithCarry() {
        l1.add(5);
        l1.add(5);
        l2.add(5);
        l2.add(5);

        lRes.add(1);
        lRes.add(1);
        lRes.add(0);
        assertEquals(lRes, listesNumeriques.ajoute(l1, l2));
    }


    /**
     * Teste la méthode areInLegalRange dans le cas où les éléments de la liste sont compris entre 0 et 9
     */
    @Test
    void testAreInLegalRangeEdgeCases() {
        l1.add(0);
        l1.add(9);

        assertDoesNotThrow(() -> listesNumeriques.areInLegalRange(l1));
    }

    /**
     * Teste la méthode areInLegalRange dans le cas où les éléments de la liste sont compris entre 0 et 9
     */
    @Test
    void testAreInLegalRangeOk() {
        l1.add(0, 1);
        l1.add(0, 2);
        l2.add(0, 3);
        l2.add(0, 3);

        assertDoesNotThrow(() -> listesNumeriques.areInLegalRange(l1));
        assertDoesNotThrow(() -> listesNumeriques.areInLegalRange(l2));
    }

    /**
     * Teste la méthode areInLegalRange dans le cas où les éléments de la liste ne sont pas compris entre 0 et 9
     */
    @Test
    void testAreInLegalRangeThrowsException() {
        l1.add(0, 10);
        l1.add(0, 3);

        assertThatThrownBy(() -> listesNumeriques.areInLegalRange(l1))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    /**
     * Teste la méthode areInLegalRange dans le cas où la liste a un élément négatif
     */
    @Test
    void testAreInLegalRangeBelowZero() {
        l1.add(-1);

        assertThatThrownBy(() -> listesNumeriques.areInLegalRange(l1))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    /**
     * Teste la méthode areInLegalRange dans le cas où la liste a un élément supérieur à 9
     */
    @Test
    void testAreInLegalRangeAboveNine() {
        l1.add(10);

        assertThatThrownBy(() -> listesNumeriques.areInLegalRange(l1))
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }


}
