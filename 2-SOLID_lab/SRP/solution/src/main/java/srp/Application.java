package srp;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        var avions = List.of(
                new Avion("avion1", 1, 2),
                new Avion("avion2", 10, 3),
                new Avion("avion3", -2, 7),
                new Avion("avion4", 6, -3),
                new Avion("avion5", 3, 4),
                new Avion("avion6", 9, 10)
        );

        var radar = new Radar(0, 0);

        // lat puis lon
        var latLonPrinter = new CoordonneesPrinter(PrintCase.LAT_FIRST);
        System.out.println(radar.getAvionsInZone(6, avions, latLonPrinter));
        // lon puis lat
        var lonLatPrinter = new CoordonneesPrinter(PrintCase.LON_FIRST);
        System.out.println(radar.getAvionsInZone(6, avions, lonLatPrinter));
    }
}
