package lsp;
public class Point2D {
    private int lat;
    private int lon;

    public Point2D(int lat, int lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }
}
