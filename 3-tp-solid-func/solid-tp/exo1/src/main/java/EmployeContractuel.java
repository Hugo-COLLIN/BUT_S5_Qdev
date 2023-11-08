import java.time.LocalDate;

public class EmployeContractuel extends Personnel {
    private LocalDate dateExpirationContrat;

    public EmployeContractuel(String nom, int age, LocalDate dateExpirationContrat) {
        super(nom, age);
        this.dateExpirationContrat = dateExpirationContrat;
    }
}
