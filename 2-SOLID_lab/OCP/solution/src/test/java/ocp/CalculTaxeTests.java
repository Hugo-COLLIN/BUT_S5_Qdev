package ocp;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTaxeTests {
    @Test
    public void calculeTaxes() {
        var employes = List.of(
                new Employe("Alice", 60000.0, "USA"),
                new Employe("Bob", 40000.0, "USA"),
                new Employe("Charly", 30000.0, "France"),
                new Employe("David", 9000.0, "Italie"));

        var calc = new CalculTaxe();
        var result = calc.calculeTotalTaxes(employes);

        assertEquals(39400.0, result, 0.1);
    }

    @Test
    public void calculTaxesUS() {
        var employes = List.of(
                new Employe("Alice", 60000.0, "USA"),
                new Employe("Bob", 40000.0, "USA"),
                new Employe("Charly", 30000.0, "France"),
                new Employe("David", 9000.0, "Italie"));

        var calc = new CalculTaxe();
        var result = calc.calculeTotalTaxesAvecNationalites(employes);

        assertEquals(43300.0, (Double) result, 0.1);
    }

}
