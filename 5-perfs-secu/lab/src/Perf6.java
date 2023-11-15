import java.util.ArrayList;
import java.util.LinkedList;

public class Perf6 {

    public static double timeIt(final Runnable block) {
        final long start = System.nanoTime();
        block.run();
        final long end = System.nanoTime();
        return (end - start) / 1.0e6;
    }

    static int loop = 100000;

    public static void main(String[] args) {
        double time = 0;
        ArrayList<Integer> al = new ArrayList<>(loop);
        for (int i = 0; i < loop; i++) {
            al.add(i);
        }
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                al.get(i);
            }
        });
        System.out.println(String.format("En utilisant ArrayList avec accès aléatoire: %.1f millisecondes", time));

        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < loop; i++) {
            ll.add(i);
        }
        time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                ll.get(i);
            }
        });
        System.out.println(String.format("En utilisant LinkedList avec accès aléatoire: %.1f millisecondes", time));

    }
}