import java.util.Timer;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Spy.class.getName());
        Spy spy = new Spy(log);
        MailPackage a = new MailPackage("Denis","Ivan", new Package("So", 12300));
        MailPackage b = new MailPackage("Zhenya", "Denis", new Package("Телефон", 12000));
        Thief den = new Thief(11000);
        MailPackage s = (MailPackage) den.processMail(a);
        Inspector dis = new Inspector();
        MailService[]own = new MailService[]{den,dis};
        UntrustworthyMailWorker tip = new UntrustworthyMailWorker(own);
        //tip.processMail(a);
        MailMessage message = new MailMessage("Austin Powers", "Ivan", "Privet");
        spy.processMail(message);

        System.out.println(a.getFrom());
        System.out.println(spy.processMail(message));
    }
}