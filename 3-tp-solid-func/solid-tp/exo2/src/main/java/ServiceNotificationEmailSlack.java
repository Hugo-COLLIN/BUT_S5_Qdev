// Interface service notification
public interface ServiceNotificationEmailSlack {
    void sendEmail(String to, String texte);
    void sendMessageSlack(String slackUserID, String texte);
}

