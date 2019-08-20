package designpattern.visitorpattern.impl;

import designpattern.visitorpattern.ComputerPart;
import designpattern.visitorpattern.ComputerPartVisitor;

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
