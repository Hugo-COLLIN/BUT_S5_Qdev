package org.iut.func;

import java.util.*;

/**
 * Pb de mutabilité de found
 * Impératif:
 * 1 ligne de quoi
 * 4 lignes de comment
 */
public class D0Demo {
    public static void main(String[] args) {
        List<String> noms = List.of("Alice", "Bob", "Charly", "David", "Ester", "Flora");

        boolean found = false;

        for (int i = 0; i < noms.size(); i++) {
            if (noms.get(i) == "Ester") {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Ester");
        } else {
            System.out.println("not found");
        }
    }
}

