package lsp;

public class Main {

    public static void main(String[] args) {
        var calc = new CalculDistance();

        // resultat ok
        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(3, 3);
        System.out.println(calc.calcule(p1, p2));

        // resultat ko
        Point2D p3 = new Point3D(1, 1, 0);
        Point2D p4 = new Point3D(3, 3, 4);
        System.out.println(calc.calcule(p3, p4));
    }
}
