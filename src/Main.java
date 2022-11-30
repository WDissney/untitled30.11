public class Main {
    public static void main(String[] args) {
        Package my = new Package("Телефон", 40000);
        MailPackage a = new MailPackage("Denis","Ivan", new Package("Софа", 13000));
        MailPackage b = new MailPackage("Zhenya", "Denis", my);
        System.out.println();
    }
}