public class Secu9 {
    public static void main(String[] args) {
        CompteBancaire cb;
        try {
            cb = new CompteBancaire();
        } catch (SecurityException ex) {
            cb = null;
            System.out.println(ex.getMessage());
        }
        if (cb != null) {
            cb.message();
        }
        System.out.println("Comportement attendu");
    }
}

// final class CompteBancaire {
//class CompteBancaire {
//    public CompteBancaire() {
//        if (!verificationCompteID()) {
//            throw new SecurityException("Access denied!");
//        }
//    }
//
//    private boolean verificationCompteID() {
//        // retourne true si le numéro est valide, sinon false
//        // supposons que l'attaquant entre un numéro invalide
//        return false;
//    }
//
//    public void message() {
//        System.out.println("Bienvenue! Vous avez maintenant accès à vos comptes.");
//    }
//}

 class CompteBancaire {
 private volatile boolean initialise = false;

 public CompteBancaire() {
 if (!verificationCompteID()) {
 return; // le constructeur échoue !
 }
 this.initialise = true; // le constructeur est ok
 }

 private boolean verificationCompteID() {
 return false;
 }

 public void message() {
 if (!this.initialise) {
 System.out.println("Access denied!");
 //throw new SecurityException("Access denied!");
 } else {
 System.out.println("Bienvenue! Vous avez maintenant accès à vos comptes.");
 }
 }
 }
