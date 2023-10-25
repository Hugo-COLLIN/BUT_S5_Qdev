package srp;

import java.util.List;

public class Radar {
    private int latOrigine;
    private int lonOrigine;

    public Radar(int latOrigine, int lonOrigine) {
        this.latOrigine = latOrigine;
        this.lonOrigine = lonOrigine;
    }

    public String getAvionsInZone(int zone, List<Avion> listeAvions, PrintCase printCase) {
        var avionsInZone = listeAvions
                .stream()
                .filter(a -> {
                    var distance = (int) Math.sqrt(
                            (latOrigine - a.lat()) * (latOrigine - a.lat()) +
                            (lonOrigine - a.lon()) * (lonOrigine - a.lon()));
                    return distance <= zone;
                })
                .toList();

        var sb = new StringBuilder();
        switch(printCase) {
            case LAT_FIRST -> avionsInZone.forEach(a -> 
                    sb.append("[").append(a.lat()).append(" ").append(a.lon()).append("] "));
            case LON_FIRST -> avionsInZone.forEach(a -> 
                    sb.append("[").append(a.lon()).append(" ").append(a.lat()).append("] "));
        }
        return sb.toString();
    }
}
