package main.designpattern.visitorpattern.impl;

import main.designpattern.visitorpattern.ComputerPart;
import main.designpattern.visitorpattern.ComputerPartVisitor;

/**
 * @author bx
 * @date 8/20/2019 10:13 AM
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts=new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0;i<parts.length;i++){
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
