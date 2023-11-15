import java.util.Arrays;

public class RessourceProtegee {

    private final String ressourceProtegee = "Le contenu de la ressource est secret...";
    private final String[] allowedUsers = {"Paul", "Jeanne", "Bob"};
    private String currentUser;

    public String[] getAllowedUsers() {
//        return allowedUsers;
        return Arrays.copyOf(allowedUsers, allowedUsers.length);
    }

    // supprimer cette methode et set dans le constructeur
    public void setCurrentUser(String user) {
        this.currentUser = user;
    }

    public String currentUser() {
        return this.currentUser;
    }

    public void utilisationRessource() throws Exception {
        for (String allowedUser : allowedUsers) {
            if (currentUser().equals(allowedUser)) {
                System.out.println("Acces OK");
                System.out.println(ressourceProtegee);
                return;
            }
        }
        throw new Exception("Pb acces");
    }
}
