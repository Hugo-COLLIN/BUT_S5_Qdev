public class Rectangle extends FormeGeometrique {
    private int minX;
    private int minY;
    private int maxX;
    private int maxY;

    public Rectangle(int xHautGauche, int yHautGauche, int xBasDroite, int yBasDroite) {
        this.minX = xHautGauche;
        this.minY = yHautGauche;
        this.maxX = xBasDroite;
        this.maxY = yBasDroite;
    }
    public int getMinX() {
        return minX;
    }
    public int getMinY() {
        return minY;
    }
    public int getMaxX() {
        return maxX;
    }
    public int getMaxY() {
        return maxY;
    }
}
