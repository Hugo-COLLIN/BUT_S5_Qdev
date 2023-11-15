public class Perf8 {

    public static double timeIt(final Runnable block) {
        final long start = System.nanoTime();
        block.run();
        final long end = System.nanoTime();
        return (end - start) / 1.0e6;
    }

    static int loop = 10000;

    public static void main(String[] args) {
        double time = 0;
        Object obj = null;

        // on lève une exception, même pour du code métier
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                try {
                    obj.hashCode();
                } catch (Exception e) {
                }
            }
        });
        System.out.println(String.format("Utilisation d'une exception: %.1f millisecondes", time));

        // on se sert de la logique métier, i.e. on teste
        time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                if (obj != null) {
                    obj.hashCode();
                }
            }
        });
        System.out.println(String.format("Utilisation de la logique métier: %.1f millisecondes", time));
    }
}
