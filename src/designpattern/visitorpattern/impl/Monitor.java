package designpattern.visitorpattern.impl;

import designpattern.visitorpattern.ComputerPart;
import designpattern.visitorpattern.ComputerPartVisitor;

/**
 * @author bx
 * @date 8/20/2019 10:13 AM
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
