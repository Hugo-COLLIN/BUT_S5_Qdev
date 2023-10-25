package isp;

public class Application {
    public static void main(String[] args) {
        var radarLabel = new AffichageStandard(
                "AF-1234",
                new Coordonnees(45, 24, 9000),
                100
        );
        System.out.println(radarLabel.getValeursVol());
    }
}
