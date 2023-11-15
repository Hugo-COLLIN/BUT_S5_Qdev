import java.util.*;

public class Secu3 {

//    private static void removeAccount(Vector<String> v, String name) {
//        Enumeration<String> e = v.elements();
//
//        while (e.hasMoreElements()) {
//            String s = e.nextElement();
//            if (s.equals(name)) {
//                v.remove(name);
//            }
//        }
//        System.out.println("Noms: ");
//        e = v.elements();
//        while (e.hasMoreElements()) {
//            System.out.println(e.nextElement());
//        }
//    }

    private static void removeAccount(Vector<String> v, String name) {
        Iterator<String> e = v.iterator();

        while (e.hasNext()) {
            String s = e.next();
            if (s.equals(name)) {
                e.remove();
            }
        }
        System.out.println("Noms: ");
        e = v.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
    }

    public static void main(String args[]) {
        List<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charly", "Bob"));
        Vector<String> v = new Vector<>(list);
        removeAccount(v, "Bob");
    }
}
