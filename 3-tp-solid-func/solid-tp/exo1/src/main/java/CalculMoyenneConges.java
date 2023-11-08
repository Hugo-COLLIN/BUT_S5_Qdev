import java.util.List;

public class CalculMoyenneConges {
    public double moyenneJoursCongesRestantsParEmploye(List<Personnel> personnels){
        if(personnels.isEmpty()){
            return 0;
        }
        var totalJoursRestants = personnels.stream()
                .filter(e -> e instanceof Employe)
                .mapToInt(e -> ((Employe) e).joursCongesRestants())
                .sum();
        var totalEmployes = personnels.size();

        return (double)totalJoursRestants / (double)totalEmployes;
    }
}
