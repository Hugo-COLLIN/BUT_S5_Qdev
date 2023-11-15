// Attaque type Man in the Middle - Secu9
public class Interceptor extends CompteBancaire {
    private static Interceptor stealInstance = null;

    public static Interceptor get() {
        try {
            new Interceptor();
        } catch (Exception ex) {/* on ignore l'exception */}
        try {
            synchronized (Interceptor.class) {
                while (stealInstance == null) {
                    System.gc();
                    Interceptor.class.wait(10);
                }
            }
        } catch (InterruptedException ex) { return null; }
        return stealInstance;
    }

    public void finalize() {
        synchronized (Interceptor.class) {
            stealInstance = this;
            Interceptor.class.notify();
        }
        System.out.println("Récupération de l'instance dans finalize de " + this);
    }
}