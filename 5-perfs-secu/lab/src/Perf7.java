import java.util.ArrayList;
import java.util.LinkedList;

public class Perf7 {

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
                al.add(0, Integer.valueOf(i));
            }
        });
        System.out.println(String.format("En utilisant ArrayList insertion: %.1f millisecondes", time));

        LinkedList<Integer> ll = new LinkedList<>();
        time = 0;
        time += timeIt(() -> {
            for (int i = 0; i < loop; i++) {
                ll.add(0, Integer.valueOf(i));
            }
        });
        System.out.println(String.format("En utilisant LinkedList insertion: %.1f millisecondes", time));
    }
}
