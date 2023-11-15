import java.util.Arrays;

// On n'utilise les exceptions que pour des conditions exceptionnelles
public class Perf9 {

    public static double timeIt(final Runnable block) {
        final long start = System.nanoTime();
        block.run();
        final long end = System.nanoTime();
        return (end - start) / 1.0e6;
    }

    static int loop = 10000;

    public static void main(String[] args) {
        int[] fArray = new int[1];

        // utilisation d'une exception
        double time = 0;
        time += timeIt(() -> {
            int fSum = 0;
            for (int i = 0; i < loop; i++) {
                try {
                    fSum += fArray[i];
                } catch (IndexOutOfBoundsException e) {
                }
            }
        });
        System.out.println(String.format("Utilisation d'une exception: %.1f millisecondes", time));

        // utilisation de la logique métier
        time = 0;
        time += timeIt(() -> {
            int fSum = 0;
            for (int i = 0; i < loop; i++) {
                if (i < fArray.length) {
                    fSum += fArray[i];
                }
            }
        });
        System.out.println(String.format("Utilisation de la logique métier: %.1f millisecondes", time));

        // utilisation du style fonctionnel
        time = 0;
        time += timeIt(() -> {
            int fSum = Arrays.stream(fArray).sum();
        });
        System.out.println(String.format("Utilisation du style fonctionnel: %.1f millisecondes", time));
    }
}