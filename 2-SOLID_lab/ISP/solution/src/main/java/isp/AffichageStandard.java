package isp;

import java.text.MessageFormat;
import java.util.List;

public class AffichageStandard implements AffichageDonneesVol, AffichageVolInteractionSouris {
    private final String nomAvion;
    private Coordonnees position;
    private int vitesse;
    private String couleurActuelle = "blanc";

    public AffichageStandard(String nomAvion, Coordonnees position, int vitesse) {
        this.nomAvion = nomAvion;
        this.position = position;
        this.vitesse = vitesse;
    }


    @Override
    public String getValeursVol() {
        return MessageFormat.format("{0} @ {1} pieds - {2} noeuds",
                nomAvion,
                position.alt(),
                vitesse);
    }

    @Override
    public String getCouleurAffichageVol() {
        return "orange";
    }

    @Override
    public void onClicVol() {
        this.couleurActuelle = getCouleurAffichageVol();
    }

    @Override
    public void onDoubleClicVol() {
        this.couleurActuelle = getCouleurAffichageVol();
    }
}
