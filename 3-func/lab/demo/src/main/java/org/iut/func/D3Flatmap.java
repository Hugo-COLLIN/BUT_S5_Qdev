package org.iut.func;

import java.util.List;

public class D3Flatmap {
    public static void main(String[] args) {
        /*
        <!> Collection de collection
         */
        List<Integer> liste = List.of(1,2,3,4,5,6);

        List<List<Integer>> res = liste.stream()
                .map(elt -> List.of(elt - 1, elt + 1))
                .toList();

        System.out.println(res);


        // 1 to many : utiliser flatmap
        List<Integer> res2 = liste.stream()
                .map(elt -> List.of(elt - 1, elt + 1))
                .flatMap(List::stream)// applatit une liste
                .toList();

        System.out.println(res2);
    }


}

