public class Thief implements MailService {
    int price;
    private int value;

    public Thief(int price) {
        this.price = price;
    }

    public int getStolenValue() {
        return value;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (this.price < (((MailPackage) mail).getContent().getPrice())) {
                value += ((MailPackage) mail).getContent().getPrice();
                return new MailPackage(((MailPackage) mail).from, ((MailPackage) mail).to, new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
