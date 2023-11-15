import java.math.BigDecimal;

public class Secu8 {

//    public static void main(String[] args) {
//        double solde = 1.00;
//        int nbProduits = 0;
//        for (double prix = 0.10; solde >= prix; prix += 0.10) {
//            solde -= prix;
//            nbProduits++;
//        }
//    }

    public static void main(String[] args) {
        BigDecimal solde = new BigDecimal("1.00");
        int nbProduits = 0;
        for (BigDecimal prix = new BigDecimal("0.10"); solde.compareTo(prix) >= 0; prix = prix.add(new BigDecimal("0.10"))) {
            solde = solde.subtract(prix);
            nbProduits++;
        }
    }
}