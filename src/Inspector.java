public class Inspector implements MailService{
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    public static final String STONES = "stones";

    @Override
    public Sendable processMail(Sendable mail) {
        if (((MailPackage)mail).getContent().getContent().contains(WEAPONS) || ((MailPackage)mail).getContent().getContent().contains(BANNED_SUBSTANCE)){
            throw new IllegalPackageException();
        }
        if (((MailPackage)mail).getContent().getContent().contains(STONES)){
            throw new StolenPackageException();
        }
        return mail;
    }
}
