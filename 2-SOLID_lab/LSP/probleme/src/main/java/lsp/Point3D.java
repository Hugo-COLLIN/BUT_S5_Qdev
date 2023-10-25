package lsp;
public class Point3D extends Point2D{
    private int alt;

    public Point3D(int lat, int lon, int alt) {
        super(lat, lon);
        this.alt = alt;
    }

    public int getAlt() {
        return alt;
    }
}
