package main.designpattern.observerpattern;

/**
 * @author bx
 * @date 8/15/2019 3:47 PM
 */
public  abstract class Observer {
    protected Subject subject;
    public abstract void  update();
}
