package FactoryMethod;

/**
 * 实现类
 * @author Kyle.Wang
 * 2018-03-11 10:19
 */
public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is SmsSender");
    }
}
