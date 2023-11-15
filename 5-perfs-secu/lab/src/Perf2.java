public class Perf2 {

    public static double timeIt(final Runnable block) {
        final long start = System.nanoTime();
        block.run();
        final long end = System.nanoTime();
        return (end - start)/1.0e6;
    }

    static int loop = 1000000;

    public static void main(String[] args) {
        double time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                String x = "Hello1" + "," + " " + "World";
            }
        });
        System.out.println(String.format("En utilisant String literal: %.1f millisecondes", time));

        time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                String x = new String("Hello2" + "," + " " + "World");
            }
        });
        System.out.println(String.format("En utilisant un objet String: %.1f millisecondes", time));
    }

}