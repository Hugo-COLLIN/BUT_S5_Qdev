public class Secu7 {

    public static void main(String[] args) {
        RessourceProtegee rp = new RessourceProtegee();
        try {
//            rp.setCurrentUser("Paul");
            rp.setCurrentUser("Pierre");
            rp.setCurrentUser(rp.getAllowedUsers()[0]);
            rp.getAllowedUsers()[0] = rp.currentUser(); // problème de mutabilité de la collection
            rp.utilisationRessource();
        } catch (Exception e) {
            System.out.println("Accès non autorisé");
        }
    }
}

