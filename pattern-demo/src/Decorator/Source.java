package Decorator;

/**
 * @author Kyle.Wang
 * 2018-03-18 20:07
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
