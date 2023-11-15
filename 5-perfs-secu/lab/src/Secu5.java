public class Secu5 {

    public static Integer multAccuBug(Integer oldAcc, Integer newVal, Integer scale) {
        return oldAcc + (newVal * scale);
    }

    public static void main(String args[]) {
        Integer res = multAccuBug(98765432, 87654321, 2345);
        System.out.println(res);
    }
}
