import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secu11 {

    static class RangeClass implements Serializable {
        private final int begin;
        private final int end;

        RangeClass(int begin, int end) {
            if (begin > end) {
                throw new IllegalStateException("Begin doit être inférieur à end");
            }
            this.begin = begin;
            this.end = end;
            System.out.println("Exécution du constructeur de Range");
        }

        @Override
        public String toString() {
            return "Range{begin= " + begin + "; end= " + end + "}";
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // écriture
        var range = new RangeClass(10, 0);
        System.out.println("range = " + range);
        var fos = Files.newOutputStream(Path.of("range-10-0.data"));
        var oos = new ObjectOutputStream(fos);
        oos.writeObject(range);
        // lecture
        // var is = Files.newInputStream(Path.of("range-10-0.data"));
        // var ois = new ObjectInputStream(is);
        // System.out.println("Lecture range");
        // var readRange = ois.readObject();
        // System.out.println("readRange = " + readRange);
    }
}

// le constructeur RangeClass n'est pas appelé lors de la déserialisation
// remplacer range par record RangeClass(int begin, int end) { }
