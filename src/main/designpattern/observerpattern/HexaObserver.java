package main.designpattern.observerpattern;

/**
 * @author bx
 * @date 8/15/2019 3:55 PM
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Hexa String :" + Integer.toHexString(subject.getState()));
    }
}
