package org.iut.tdd;

import java.util.ArrayList;
import java.util.List;

/**
* La classe ListesNumeriques permet d'ajouter 2 entiers représentés en utilisant des listes de chiffres.
* 
*/
public class ListesNumeriques {

    /**
     * <p>La méthode considère 2 entiers qui sont représentés en utilisant des listes de 
     * chiffres, respectivement <code>nb1</code> et <code>nb2</code>.
     * La méthode ajoute ces 2 entiers et renvoie le résultat comme une liste de chiffres.
     * </p>
     * <p>Par exemple, si on veut ajouter les entiers 142 et 13, on doit créer une liste 
     * (nb1) avec trois éléments [1,4,2] et une liste (nb2) avec deux éléments [1,3].
     * Comme 142+13 = 155, le programme doit donc produire une liste avec trois éléments [1,5,5]
     * </p>
     * [1,4,2] + [1,3] = [1,5,5]
     * <p>
     * Chaque élément des listes nb1 et nb2 doit être compris entre 0 et 9.
     * Une exception <code>IllegalArgumentException</code> est levée si cette condition préalable n'est 
     * pas remplie.
     * </p>
     * 
     * @param nb1  liste qui contient le premier entier. Null renvoie <code>null</code>, vide signifie 0
     * @param nb2  liste qui contient le deuxième entier. Null renvoie <code>null</code>, vide signifie 0
     * @return la somme de nb1 et nb2 représentée comme une liste de chiffres
     */
    public List<Integer> ajoute(List<Integer> nb1, List<Integer> nb2) {
        if (nb1 == null || nb2 == null) return null;
        areInLegalRange(nb1);
        areInLegalRange(nb2);

        List<Integer> res = new ArrayList<>();
        int retenue = 0;
        int l = Math.max(nb1.size(), nb2.size());

        int a, b;
        for (int i = l-1; i >= 0; i--) {
            if (i < nb1.size()) a = nb1.get(i); else a = 0;
            if (i < nb2.size()) b = nb2.get(i); else b = 0;
            int somme = a + b + retenue;
            retenue = somme / 10;
            res.add(0, somme % 10);
        }

        if (retenue > 0) res.add(0, retenue);

        return res;
    }

    /**
     * Vérifie que chaque élément des listes nb1 et nb2 est compris entre 0 et 9.
     * Une exception <code>IllegalArgumentException</code> est levée si cette condition préalable n'est
     * pas remplie.
     * @param list liste à vérifier
     * @throws IllegalArgumentException si un élément de la liste n'est pas compris entre 0 et 9
     * @see IllegalArgumentException
     */
    public void areInLegalRange(List<Integer> list) {
        list.forEach(x -> {
            if (x < 0 || x > 9) throw new IllegalArgumentException("Chaque élément des listes nb1 et nb2 doit être compris entre 0 et 9.");
        });
    }

}
