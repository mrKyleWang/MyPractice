package FactoryMethod;

/**
 * @author Kyle.Wang
 * 2018-03-11 10:21
 */
public class Test {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.Send();

    }
}
