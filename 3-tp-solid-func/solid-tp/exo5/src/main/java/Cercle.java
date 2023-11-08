public class Cercle extends FormeGeometrique {
    private int xOrigine;
    private int yOrigine;
    private int rayon;

    public Cercle(int xOrigine, int yOrigine, int rayon) {
        this.xOrigine = xOrigine;
        this.yOrigine = yOrigine;
        this.rayon = rayon;
    }
    public int getxOrigine() {
        return xOrigine;
    }
    public int getyOrigine() {
        return yOrigine;
    }
    public int getRayon() {
        return rayon;
    }

    @Override
    boolean isPointDansForme(int x, int y) {
        var distanceOrigine = Math.sqrt(
                (this.getyOrigine() - y) * (this.getyOrigine() - y) +
                (this.getxOrigine() - x) * (this.getxOrigine() - x)
        );
        return distanceOrigine <= this.getRayon();
    }
}
