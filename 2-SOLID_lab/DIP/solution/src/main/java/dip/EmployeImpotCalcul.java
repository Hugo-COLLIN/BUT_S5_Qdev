package dip;

public class EmployeImpotCalcul {
    private EmployeAPI employeApiService;

    public EmployeImpotCalcul(EmployeAPI employeRestApiService) {
        this.employeApiService = employeRestApiService;
    }

    public double calculMoyenneRevenus(){
        var employes = employeApiService.findAll();
        return employes.stream()
                .mapToInt(Employe::revenu)
                .average()
                .getAsDouble();
    }
}
