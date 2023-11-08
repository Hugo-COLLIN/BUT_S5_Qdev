import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creation employes
        var alice = new EmployeTempsPlein("Alice", 20);
        alice.setNbJoursCongesPris(11);
        var bob = new EmployeTempsPlein("Bob", 41);
        bob.setNbJoursCongesPris(2);
        var contractuel = new EmployeContractuel("Charly", 30, LocalDate.now().plusYears(1));
        List<Employe> employes = List.of(alice, bob, contractuel);

        var calcul = new CalculMoyenneConges();
        var resultat = calcul.moyenneJoursCongesRestantsParEmploye(employes);

        // Les contractuels externes posent un problème dans le calcul de la moyenne
        // Ils n'ont pas de jours de congé, et ils ne devraient pas être pris en compte. 
        // Un Contractuel ne remplace donc pas entièrement un employé.
        System.out.println("Moyenne des congés " + resultat);
    }
}
