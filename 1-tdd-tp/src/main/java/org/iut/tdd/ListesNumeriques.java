package org.iut.tdd;

import java.util.ArrayList;
import java.util.List;

/**
* La classe ListesNumeriques permet d'ajouter 2 entiers représentés en utilisant des listes de chiffres.
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
        // si nb1 ou nb2 est null, renvoie null
        if (nb1 == null || nb2 == null) return null;

        // vérifie que chaque élément de nb1 et nb2 est compris entre 0 et 9
        areInLegalRange(nb1);
        areInLegalRange(nb2);

        // initialise la liste qui contiendra le résultat
        List<Integer> res = new ArrayList<>();
        int retenue = 0;

        // prend la taille de la liste la plus grande
        int l = Math.max(nb1.size(), nb2.size());

        // initialise les variables qui contiendront les éléments de nb1 et nb2
        int a;
        int b;

        // additionne les éléments de nb1 et nb2 en partant de la fin
        for (int i = l-1; i >= 0; i--) {
            // si i est plus petit que la taille de nb1, a prend la valeur de l'élément de nb1 à l'indice i, sinon a prend la valeur 0 (idem pour b et nb2)
            if (i < nb1.size()) a = nb1.get(i); else a = 0;
            if (i < nb2.size()) b = nb2.get(i); else b = 0;

            // calcule la somme de a, b et de la retenue
            int somme = a + b + retenue;

            // la retenue prend la valeur de la division entière de la somme par 10
            retenue = somme / 10;

            // ajoute le chiffre calculé au début de la liste res
            res.add(0, somme % 10);
        }

        // s'il reste une retenue à la fin de la boucle de calcul, l'ajoute au début de la liste res
        if (retenue > 0) res.add(0, retenue);

        // retourne le résultat sous forme de liste
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
        // vérifie que chaque élément de la liste est compris entre 0 et 9
        list.forEach(x -> {
            // si ce n'est pas le cas pour l'un des éléments, lève une exception
            if (x < 0 || x > 9) throw new IllegalArgumentException("Chaque élément des listes nb1 et nb2 doit être compris entre 0 et 9.");
        });
    }

}
