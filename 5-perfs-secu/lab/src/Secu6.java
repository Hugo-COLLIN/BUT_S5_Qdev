import java.util.Hashtable;

public class Secu6 {
        private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

        private Secu6() {
            ht.put(1, "12-34-56-789");
        }

        public Hashtable<Integer,String> getValues(){
//            return ht;
            return (Hashtable<Integer,String>) ht.clone();
        }

        public static void main(String[] args) {
            Secu6 mutable = new Secu6();
            Hashtable<Integer, String> ht1 = mutable.getValues();
            System.out.println(ht1);
            Hashtable<Integer, String> ht2 = mutable.getValues();
            System.out.println(ht2);
            ht1.remove(1);
            System.out.println(ht2);
        }
    }
