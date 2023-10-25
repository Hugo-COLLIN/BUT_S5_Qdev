package isp;

import java.util.List;

public interface AffichageDonneesVol {
    String getValeursVol();
    String getCouleurAffichageVol();
    void onClicVol();
    void onDoubleClicVol();
    void onAppuiLongVol();
    void executerCommande(String id, List<String> commandeArgs);
}
