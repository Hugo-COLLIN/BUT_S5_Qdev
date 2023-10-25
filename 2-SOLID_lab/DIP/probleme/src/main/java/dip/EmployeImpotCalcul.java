package dip;

public class EmployeImpotCalcul {
    private EmployeRestAPIService employeApiService;

    public EmployeImpotCalcul(EmployeRestAPIService employeRestApiService) {
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
