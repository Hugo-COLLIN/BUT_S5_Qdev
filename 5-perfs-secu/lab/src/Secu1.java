import java.util.*;

public class Secu1 {
    public static void main(String[] args) {
        Inventaire inv = new Inventaire();
        List<String> items = inv.getStock();
        System.out.println(items.size());
    }
}

class Inventaire {
    private final Hashtable<String, Integer> items;

    public Inventaire() {
        items = new Hashtable<String, Integer>();
    }

    public List<String> getStock() {
        List<String> stock = new ArrayList<String>();
        Enumeration<String> itemKeys = items.keys();
        while (itemKeys.hasMoreElements()) {
            String value = itemKeys.nextElement();
            if ((items.get(value)) == 0) {
                stock.add(value);
            }
        }
        if (items.size() == 0) {
//            return null;
            return Collections.emptyList();
        } else {
            return stock;
        }
    }
}


