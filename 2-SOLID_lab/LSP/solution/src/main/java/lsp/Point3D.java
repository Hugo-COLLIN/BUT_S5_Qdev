package lsp;
public class Point3D {
    private int alt, lat, lon;

    public Point3D(int lat, int lon, int alt) {
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}
