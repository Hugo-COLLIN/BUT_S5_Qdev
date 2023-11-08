import java.util.List;

public class CalculPointDansFormes {
    public boolean isPointDansFormes(int x, int y, List<FormeGeometrique> formes) {
        for (var s : formes) {
            if (s instanceof Rectangle r) {
                if (x <= r.getMaxX() &&
                        x >= r.getMinX() &&
                        y >= r.getMinY() &&
                        y <= r.getMaxY()) {
                    return true;
                }
            }
            if (s instanceof Cercle c) {
                var distanceOrigine = Math.sqrt(
                        (c.getyOrigine() - y) * (c.getyOrigine() - y) +
                        (c.getxOrigine() - x) * (c.getxOrigine() - x)
                );
                if (distanceOrigine <= c.getRayon()) {
                    return true;
                }
            }
        }
        return false;
    }
}
