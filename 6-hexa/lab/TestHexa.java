import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TestHexa {

    public static void main(String args[]) throws IOException {

        // 1 - persistence (M)
        List<Integer> liste = Files.lines(Paths.get("file.txt"))
                .map(Integer::parseInt)
                .toList();


        // 2 - domaine métier (C)
        var total = liste.stream().mapToInt(e -> e).sum();

        // 3 - API pour affichage (V)
        System.out.println("La somme est égale à: " + total);
        System.out.println("Le nombre d'éléments est égal à: " + liste.size());
        System.out.println("La moyenne est égale à: " + (double)total/liste.size());
    }
}

