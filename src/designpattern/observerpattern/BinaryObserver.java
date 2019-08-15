package designpattern.observerpattern;

/**
 * @author bx
 * @date 8/15/2019 3:55 PM
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Binary String :" + Integer.toBinaryString(subject.getState()));
    }
}
