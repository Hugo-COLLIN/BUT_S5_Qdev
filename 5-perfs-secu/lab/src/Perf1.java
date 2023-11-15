public class Perf1 {

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
            String nom = "Toto";
            for (int i = 0; i < loop; i++) {
                String x = "Hello";
                x += ",";
                x += " ";
                x += nom;
            }
        });
        System.out.println(String.format("En utilisant String: %.1f millisecondes", time));

        time = 0;
        time += timeIt(() -> {
            String nom = "Toto";
            for (int i = 0; i < loop; i++) {
                String x = new StringBuffer().append("Hello").append(",").append(" ").append(nom).toString();
            }
        });
        System.out.println(String.format("En utilisant StringBuffer: %.1f millisecondes", time));
    }
}
