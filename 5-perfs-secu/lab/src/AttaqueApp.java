// Secu9
public class AttaqueApp {

    public static void main(String[] args) {
        Interceptor i = Interceptor.get(); // on récupère l'instance

        // on peut maintenant invoquer les méthodes de la classe CompteBancaire
        i.message();
    }
}