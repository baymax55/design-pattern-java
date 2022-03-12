package main.designpattern.visitorpattern;

import main.designpattern.visitorpattern.impl.Computer;
import main.designpattern.visitorpattern.impl.Keyboard;
import main.designpattern.visitorpattern.impl.Monitor;
import main.designpattern.visitorpattern.impl.Mouse;

/**
 * @author bx
 * @date 8/20/2019 10:14 AM
 */
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}
