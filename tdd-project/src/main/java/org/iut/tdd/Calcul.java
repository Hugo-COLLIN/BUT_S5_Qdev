package org.iut.tdd;

public class Calcul {
    public int somme(int x, int y) {
        if (Math.abs(y) > Integer.MAX_VALUE - Math.abs(x))
            throw new ArithmeticException("Dépassement de capacite");
        return x + y;
    }

    public int difference(int x, int y) {
        if (Math.abs(y) > Integer.MAX_VALUE - Math.abs(x))
            throw new ArithmeticException("Dépassement de capacite");
        return x - y;
    }

//    public int multiplication(int x, int y) {
//        int res = 1;
//        for (int i = 1; i <= y ; i ++)
//            res = x * i;
//        return res;
//    }

    public int multiplication(int x, int y) {
        if (Math.abs(y) > Integer.MAX_VALUE - Math.abs(x))
            throw new ArithmeticException("Dépassement de capacite");
        return x * y;
    }
}
