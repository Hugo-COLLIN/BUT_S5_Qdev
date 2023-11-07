package org.iut.func;

import java.util.List;

/**
 * Pb de mutabilité de found
 * Impératif:
 * 1 ligne de quoi
 * 4 lignes de comment
 */
public class D1FilterMapReduce {
    public static void main(String[] args) {
        List<String> noms = List.of("Alice", "Bob", "Charly", "David", "Ester", "Flora");

//        boolean found = false;
//
//        for (int i = 0; i < noms.size(); i++) {
//            if (noms.get(i) == "Ester") {
//                found = true;
//                break;
//            }
//        }

//        if (noms.contains("Ester")) {
//            System.out.println("Ester");
//        } else {
//            System.out.println("not found");
//        }

        String ester = noms.stream()
                .filter(nom -> "Ester".equals(nom))
                .findAny()
                .orElse("not found");
        System.out.println("Ester");

        List<Integer> nombres = List.of(1,2,3,4,5,6); //liste immuable ; ne plus utiliser arraylist

        //filter: nbr <= d'éléments - sélectionne une partiedes éléments
        nombres.stream()
                .filter(e -> e%2 == 0)
                .forEach(System.out::println); //consommateur: affiche ce qui correspond au critère de sélection
                // :: applique la valeur précédente à la fonction, évite d'écrire du code inutile


        // map: même nbr d'éléments - transforme chaque élément
        nombres.stream()
                .map(e->e*2)
                .forEach(System.out::println);


        // reduce: 1 élément - peut être:
        // - valeur (elt) unique
        // - collection
        var res = nombres.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e*2)
                // renvoie 1 seule valeur
                .reduce(0, (total, elt) -> total + elt);

        System.out.println(res);

        var res2 = nombres.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e*2)
                // renvoie une collection
                .toList();

        System.out.println(res2);
    }
}

