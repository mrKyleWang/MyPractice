package AbstractFactory;

/**
 * @author Kyle.Wang
 * 2018-03-11 10:30
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
