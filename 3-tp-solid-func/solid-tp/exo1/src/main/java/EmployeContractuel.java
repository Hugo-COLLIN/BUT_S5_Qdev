import java.time.LocalDate;

public class EmployeContractuel extends Employe {
    private LocalDate dateExpirationContrat;

    public EmployeContractuel(String nom, int age, LocalDate dateExpirationContrat) {
        super(nom, age);
        this.dateExpirationContrat = dateExpirationContrat;
    }

    @Override
    public int joursCongesRestants() {
        // Un contractuel n'a pas de jours de congés mais on est
        // obligé d'implanter la méthode, donc on retourne 0
        return 0;
    }
}
