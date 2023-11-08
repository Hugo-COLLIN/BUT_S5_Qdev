public class ServiceNotificationEntreprise implements ServiceNotification {
    @Override
    public void sendSMS(String noTelephone, String texte) {
        // Pas d'implantation
        return;
    }

    @Override
    public void sendEmail(String to, String texte) {
        System.out.println("Envoi à " + to + " du message " + texte);
    }

    @Override
    public void sendApplicationInterne(String texte) {
        // Pas d'implantation
        return;
    }

    @Override
    public void sendMessageSlack(String slackUserID, String texte) {
        System.out.println("Envoi à " + slackUserID + " du message " + texte);
    }
}
