package ocp;

import java.util.List;

public class CalculTaxe {
    public double calculeTotalTaxes(List<Employe> employes) {
        var taxes = 0.0;

        for (var e : employes) {
            var taxe =  calculeTaxeEmploye(e);
            taxes += taxe;
        }
        return taxes;
    }

    private double calculeTaxeEmploye(Employe e) {
        double employeTaxes = 0;
        if (e.getRevenu() < 10000) {
            // 10% taxes
            employeTaxes = e.getRevenu() * 0.1;
        } else if (e.getRevenu() >= 10000 && e.getRevenu() < 50000) {
            // 20% taxes
            employeTaxes= e.getRevenu() * 0.25;
        } else if (e.getRevenu() >= 50000) {
            // 30% taxes
            employeTaxes= e.getRevenu() * 0.35;
        }
        return employeTaxes;
    }
}
