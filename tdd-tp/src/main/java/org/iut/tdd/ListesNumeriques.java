package org.iut.tdd;

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

        return null;
    }

}
