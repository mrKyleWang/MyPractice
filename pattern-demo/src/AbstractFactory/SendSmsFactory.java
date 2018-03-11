package AbstractFactory;

/**
 * @author Kyle.Wang
 * 2018-03-11 10:31
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
