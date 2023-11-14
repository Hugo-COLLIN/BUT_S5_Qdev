import java.util.concurrent.Executors;

public class DemoThread {
    //public static void platformThread() {
    public static void main(String[] args) {

        Thread.ofPlatform().start(() -> System.out.println(Thread.currentThread()));

        virtualThread();
    }

    public static void virtualThread() {
        Thread.startVirtualThread(() -> System.out.println(Thread.currentThread()));

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
            executor.submit(() -> System.out.println(Thread.currentThread()));
        }
    }
}

//Thread[#22,Thread-0,5,main]
//VirtualThread[#23]/runnable@ForkJoinPool-1-worker-1
//VirtualThread[#26]/runnable@ForkJoinPool-1-worker-2
//VirtualThread[#27]/runnable@ForkJoinPool-1-worker-1
//VirtualThread[#29]/runnable@ForkJoinPool-1-worker-1

// il a reutilisé 1 thread pour les 3 virtual threads