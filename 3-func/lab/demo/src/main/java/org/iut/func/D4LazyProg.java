package org.iut.func;

import java.util.List;

public class D4LazyProg {

    public static boolean check(int nb) {
        System.out.println("in check");
        return nb % 2 == 0;
    }

    public static int doubleIt(int nb) {
        System.out.println("in doubleit");
        return nb*2;
    }

    public static void main(String[] args) {

        List<Integer> liste = List.of(1,2,3,4,5,6);

        // lazy: tant qu'on lui demande pas de collecter l'info, il ne le fait pas
        var res = liste.stream()
                .filter(D4LazyProg::check)
                .map(D4LazyProg::doubleIt);

        System.out.println(res);

        // lazy: tant qu'on lui demande pas de collecter l'info, il ne le fait pas
        liste.stream()
                .filter(D4LazyProg::check)
                .map(D4LazyProg::doubleIt)
                .forEach(System.out::println);

        System.out.println("Terminé");
    }


}

