import java.util.UUID;

public class CompteBancaire {
    private UUID id;
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double montantInitial){
        this.titulaire = titulaire;
        this.solde = montantInitial;
        this.id = UUID.randomUUID();
    }
    public void retrait(double montant){
        this.solde -= montant;
    }
    public void depot(double montant){
        this.solde += montant;
    }
    public UUID getId() {
        return id;
    }
    public String getTitulaire() {
        return titulaire;
    }
    public double getSolde() {
        return solde;
    }
}
