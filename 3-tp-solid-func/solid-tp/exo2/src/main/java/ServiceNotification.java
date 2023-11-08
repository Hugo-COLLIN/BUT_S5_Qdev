// Interface service notification
public interface ServiceNotification {
    void sendSMS(String noTelephone, String texte);
    void sendEmail(String to, String texte);
    void sendApplicationInterne(String texte);
    void sendMessageSlack(String slackUserID, String texte);
}

