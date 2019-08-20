package designpattern.visitorpattern.impl;

import designpattern.visitorpattern.ComputerPartVisitor;

/**
 * @author bx
 * @date 8/20/2019 10:22 AM
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");

    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");

    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");

    }
}
