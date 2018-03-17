package Prototype;

/**
 * @author Kyle.Wang
 * 2018-03-17 23:22
 */
public class Prototype implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException{
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}
