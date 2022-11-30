public class UntrustworthyMailWorker implements MailService{
    private final RealMailService realMailService = new RealMailService();
    MailService[] mailServices;
    public UntrustworthyMailWorker (MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMail(Sendable mail){
        return realMailService;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService a : mailServices){
            mail = a.processMail(mail);
        }
        return realMailService.processMail(mail);
    }
}
