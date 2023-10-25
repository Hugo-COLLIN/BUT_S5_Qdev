package srp;

import java.util.List;

public class CoordonneesPrinter {
    private PrintCase printCase;

    public CoordonneesPrinter(PrintCase printCase) {
        this.printCase = printCase;
    }

    public String parse(List<Avion> avionsInZone) {
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
