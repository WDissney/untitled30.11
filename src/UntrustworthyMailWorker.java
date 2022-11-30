public class UntrustworthyMailWorker implements MailService{

    public UntrustworthyMailWorker (MailService[] mailServices){

    }

    @Override
    public Sendable processMail(Sendable mail) {
        return null;
    }
}
