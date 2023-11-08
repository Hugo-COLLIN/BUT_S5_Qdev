public class ServiceNotificationCreche implements ServiceNotification {
    private String apiURL = "https://creche.fr/api/diffusion";

    @Override
    public void sendSMS(String noTelephone, String texte) {
        System.out.println("Envoi à " + noTelephone + " du message " + texte);
    }

    @Override
    public void sendEmail(String to, String texte) {
        // Pas d'implantation
        return;
    }

    @Override
    public void sendApplicationInterne(String texte) {
        System.out.println("Envoi à " + apiURL + " du message " + texte);
    }

    @Override
    public void sendMessageSlack(String slackUserID, String texte) {
        // Pas d'implantation
        return;
    }
}
