package abstractfactorypattern.impl;

import abstractfactorypattern.Shape;

/**
 * @author bx
 * @date 7/31/2019 9:42 AM
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw()");

    }
}
