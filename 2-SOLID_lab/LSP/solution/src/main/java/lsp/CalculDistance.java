package lsp;
public class CalculDistance {
    public double calcule(Point2D p1, Point2D p2) {
        return Math.sqrt(
                (p1.getLat() - p2.getLat()) * (p1.getLat() - p2.getLat()) +
                (p1.getLon() - p2.getLon()) * (p1.getLon() - p2.getLon()));
    }

    // Calcul de la distance entre deux points 3D
    public double calcule(Point3D p1, Point3D p2) {
        return Math.sqrt(
                (p1.getLat() - p2.getLat()) * (p1.getLat() - p2.getLat()) +
                (p1.getLon() - p2.getLon()) * (p1.getLon() - p2.getLon()) +
                (p1.getAlt() - p2.getAlt()) * (p1.getAlt() - p2.getAlt()));
    }
}
