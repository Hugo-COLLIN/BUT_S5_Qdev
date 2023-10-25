package dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeImpotCalculTests {
    @Test
    public void calculMoyenneRevenus() {
        var restApiService = new EmployeRestAPIService();
        var impotCalcul= new EmployeImpotCalcul(restApiService);

        var resultat = impotCalcul.calculMoyenneRevenus();

        assertEquals(resultat, 57500.0, 0.1);
    }
}
