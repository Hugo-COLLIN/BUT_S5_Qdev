public class EmployeTempsPlein extends Employe {
    public EmployeTempsPlein(String nom, int age) {
        super(nom, age);
    }

    @Override
    public int joursCongesRestants() {
        // congés standard
        int maxJoursConges = 21;
        // l'âge permet d'avoir des congés supplémentaires
        if (this.getAge() > 40) {
            maxJoursConges = 22;
        }
        return maxJoursConges - this.getNbJoursCongesPris();
    }
}
