package dip;

import java.util.List;

public class EmployeRestAPIService {
    public List<Employe> findAll(){
        System.out.println("Simulation d'un appel à http://localhost/employes");
        return List.of(
                new Employe("Alice", 40000),
                new Employe("Bob", 80000),
                new Employe("Charly", 60000),
                new Employe("David", 50000)
        );
    }
}
