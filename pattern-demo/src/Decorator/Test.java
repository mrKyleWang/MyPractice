package Decorator;

/**
 * @author Kyle.Wang
 * 2018-03-18 20:09
 */
public class Test {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
