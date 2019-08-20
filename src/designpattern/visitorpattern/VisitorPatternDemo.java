package designpattern.visitorpattern;

import designpattern.visitorpattern.impl.Computer;
import designpattern.visitorpattern.impl.ComputerPartDisplayVisitor;

/**
 * @author bx
 * @date 8/20/2019 10:24 AM
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
