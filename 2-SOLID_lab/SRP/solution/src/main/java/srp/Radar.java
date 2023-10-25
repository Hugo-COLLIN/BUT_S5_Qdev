package srp;

import java.util.List;

public class Radar {
    private int latOrigine;
    private int lonOrigine;

    public Radar(int latOrigine, int lonOrigine) {
        this.latOrigine = latOrigine;
        this.lonOrigine = lonOrigine;
    }

    public String getAvionsInZone(int zone, List<Avion> listeAvions, CoordonneesPrinter printCase) {
        var avionsInZone = listeAvions
                .stream()
                .filter(a -> {
                    var distance = (int) Math.sqrt(
                            (latOrigine - a.lat()) * (latOrigine - a.lat()) +
                            (lonOrigine - a.lon()) * (lonOrigine - a.lon()));
                    return distance <= zone;
                })
                .toList();

        return printCase.parse(avionsInZone);
    }
}
