import java.util.List;

public class TestRecords {

	record Domaine (int debut, int fin, List<Integer> valeurs) {
        //rendre immuable un attribut
        Domaine(int debut, int fin, List<Integer> valeurs) {
            this.debut = debut;
            this.fin = fin;
            this.valeurs = List.copyOf(valeurs); //rendre immuable = copie défensive
        }

        // 1-rendre immuable un attribut
        // 2-validation
//        Domaine(int debut, int fin) {
//            if (debut > fin) {
//                throw new IllegalArgumentException("debut > fin");
//            }
//            this.debut = debut;
//            this.fin = fin;
//        }
        Domaine {
            if (debut > fin) {
                throw new IllegalArgumentException("debut > fin");
            }
        }

        Domaine(int fin) {
            this(0, fin);
        }
    }

	public static void main(String args[]) {
		Domaine domaine = new Domaine(0,5);
		System.out.println(domaine);
		System.out.println(domaine.fin());
	}
}
