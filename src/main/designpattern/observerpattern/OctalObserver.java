package main.designpattern.observerpattern;

/**
 * @author bx
 * @date 8/15/2019 3:53 PM
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String :" + Integer.toOctalString(subject.getState()));
    }
}
