package Adapter;

/**
 * @author Kyle.Wang
 * 2018-03-18 20:05
 */
public class Test {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
