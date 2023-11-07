package org.iut.func;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class D5FunctionBiFunction {

    static final BiFunction<Integer, Integer, Integer> somme = (x,y) -> x * y;
    static final Function<Integer, Integer> carre = x -> x*x;

    public static void main(String[] args) {

        List<Integer> liste = List.of(1,2,3,4,5,6);

        BiFunction<Integer, Integer, Integer> carreDeLaSomme = somme.andThen(carre);

        System.out.println(carreDeLaSomme.apply(2,3));
    }


}

