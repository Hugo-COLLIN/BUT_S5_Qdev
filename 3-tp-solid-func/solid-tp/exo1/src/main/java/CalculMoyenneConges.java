import java.util.List;

public class CalculMoyenneConges {
    public double moyenneJoursCongesRestantsParEmploye(List<Employe> employes){
        if(employes.size() == 0){
            return 0;
        }
        var totalJoursRestants = employes.stream().mapToInt(Employe::joursCongesRestants).sum();
        var totalEmployes = employes.size();

        return (double)totalJoursRestants / (double)totalEmployes;
    }
}
