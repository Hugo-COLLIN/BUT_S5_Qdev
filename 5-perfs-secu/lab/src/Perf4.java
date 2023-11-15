public class Perf4 {

    public static double timeIt(final Runnable block) {
        final long start = System.nanoTime();
        block.run();
        final long end = System.nanoTime();
        return (end - start)/1.0e6;
    }

    static int loop = 1000000;

    public static void main(String[] args) {
        double time = 0;
        String a = "abc";
        String b = "cdfghi";
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                if (a.equalsIgnoreCase(b)) {
                }
            }
        });
        System.out.println(String.format("En utilisant equalsIgnoreCase(): %.1f millisecondes", time));

        time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                if (a.equals(b)) {
                }
            }
        });
        System.out.println(String.format("En utilisant equals(): %.1f millisecondes", time));

    }
}