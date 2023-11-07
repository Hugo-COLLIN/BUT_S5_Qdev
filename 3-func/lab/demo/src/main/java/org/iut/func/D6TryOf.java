package org.iut.func;

import org.iut.func.tryof.Failure;
import org.iut.func.tryof.Success;
import org.iut.func.tryof.Try;

import java.util.List;

public class D6TryOf {
    public static void main(String[] args) {

        List<String> liste = List.of("1","2","3", "not a number", "4","5","6", "7", "8", "9", "10");

//        liste.stream()
//                .map(Integer::parseInt)
//                .forEach(System.out::println);

//        try {
//            liste.stream()
//                    .map(Integer::parseInt)
//                    .forEach(System.out::println);
//        }
//        catch (NumberFormatException nfe) {
//            System.err.println(nfe);
//        }

        // pb : code inpératif dans code fonctionnel => impossible à paralléliser
//        liste.stream()
//                .map(elt -> {
//                    try {
//                        return Integer.parseInt(elt);
//                    }
//                    catch (NumberFormatException nfe) {
//                        System.err.println(nfe);
//                        return null;
//                    }
//                })
//                .forEach(System.out::println);


        //<!> En fonctionnel, les exceptions sont des valeurs
        liste.stream()
                .map(elt -> Try.of(() -> Integer.parseInt(elt)))
                .map(converted -> switch (converted) {
                    case Success<Integer> success -> success.getResult();
                    case Failure<Integer> error -> "Problem: " + error.getError().getMessage();
                })
                .forEach(System.out::println);
    }


}

