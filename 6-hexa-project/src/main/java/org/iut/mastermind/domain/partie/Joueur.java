package org.iut.mastermind.domain.partie;

public class Joueur {

    private final String nom;

    // constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // getter nom joueur
    public String getNom() {
        return this.nom;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        return (this == o) || ((o instanceof Joueur joueur) && nom.equals(joueur.nom));
    }

    // hashcode
    @Override
    public int hashCode() {
        return nom.hashCode();
    }

}
