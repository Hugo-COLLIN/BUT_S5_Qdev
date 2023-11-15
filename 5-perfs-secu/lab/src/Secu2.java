public class Secu2 {
    public static void main(String[] args) {
        char alpha = 'A';
        int i = 0;
        boolean trueExp = true;

        System.out.println(trueExp ? alpha : 0);
        System.out.println(trueExp ? alpha : i); // les types doivent être identiques, ici alpha renvoie 65
        System.out.println(trueExp ? alpha : ((char) i));
    }
}

