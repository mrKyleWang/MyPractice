package Adapter;

/**
 * @author Kyle.Wang
 * 2018-03-18 20:04
 */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method");
    }
}
