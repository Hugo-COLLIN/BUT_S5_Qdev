public class ServiceNotificationEntreprise implements ServiceNotificationEmailSlack {
    @Override
    public void sendEmail(String to, String texte) {
        System.out.println("Envoi à " + to + " du message " + texte);
    }

    @Override
    public void sendMessageSlack(String slackUserID, String texte) {
        System.out.println("Envoi à " + slackUserID + " du message " + texte);
    }
}
