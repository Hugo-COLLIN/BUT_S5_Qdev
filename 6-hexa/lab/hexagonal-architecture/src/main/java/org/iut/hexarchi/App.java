package org.iut.hexarchi;

public class App
{
    public static void main( String[] args )
    {
        new App().start();
    }

    public void start() {
        var computeAvgServicePort = Config.computeAvgServicePort();
        System.out.println("Resultat du service (brut): " + computeAvgServicePort.compute());
        System.out.println("Resultat du service (json): {\"moyenne:\"" + computeAvgServicePort.compute() + "}");
    }
}
