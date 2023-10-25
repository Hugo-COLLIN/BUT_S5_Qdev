package ocp;

public class Employe {
    private String nom;
    private double revenu;
    private String nationalite;

    public Employe(String nom, double revenu, String nationalite) {
        this.nom = nom;
        this.revenu = revenu;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public double getRevenu() {
        return revenu;
    }

    public String getNationalite() {
        return nationalite;
    }
}
