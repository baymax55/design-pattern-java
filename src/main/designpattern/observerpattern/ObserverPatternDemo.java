package main.designpattern.observerpattern;

/**
 * @author bx
 * @date 8/15/2019 3:58 PM
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);

        System.out.println("First state change:10");
        subject.setState(10);
    }
}
