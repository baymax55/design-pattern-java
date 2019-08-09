package facadepattern.impl;

import facadepattern.Shape;

/**
 * @author bx
 * @date 8/9/2019 11:07 AM
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("rectangle draw()");
    }
}
