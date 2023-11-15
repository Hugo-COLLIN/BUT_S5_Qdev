
import java.util.function.Consumer;

class Mailer {
    public void from(String addr) { System.out.println("from..."); }
    public void to(String addr) { System.out.println("to..."); }
    public void subject(String line) { System.out.println("subject..."); }
    public void body(String content) { System.out.println("body..."); }
    public void send() { System.out.println("sending..."); }
}

public class Secu10 {
    public static void main(String[] args) {
       Mailer mailer = new Mailer();
       mailer.from("olivier.perrin@loria.fr");
       mailer.to("olivier.perrin@gmail.com");
       mailer.subject("Ton code est pourri...");
       mailer.body("...details...");
       mailer.send();
    }
}





