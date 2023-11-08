public class ServiceNotificationCreche implements ServiceNotificationSmsInterne {
    private String apiURL = "https://creche.fr/api/diffusion";

    @Override
    public void sendSMS(String noTelephone, String texte) {
        System.out.println("Envoi à " + noTelephone + " du message " + texte);
    }

    @Override
    public void sendApplicationInterne(String texte) {
        System.out.println("Envoi à " + apiURL + " du message " + texte);
    }
}
