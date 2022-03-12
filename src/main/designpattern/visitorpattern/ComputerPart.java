package main.designpattern.visitorpattern;

/**
 * @author bx
 * @date 8/20/2019 10:13 AM
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
