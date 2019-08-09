package decoratorpattern.impl;

import decoratorpattern.Shape;

/**
 * @author bx
 * @date 8/8/2019 11:45 AM
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    public Circle() {
    }
}
