package AbstractFactory;

/**
 * @author Kyle.Wang
 * 2018-03-11 10:32
 */
public class Test {
    public static void main(String[] args) {
        Provider provider= new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
