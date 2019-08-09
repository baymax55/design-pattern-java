package abstractfactorypattern.impl;

import abstractfactorypattern.Shape;

/**
 * @author bx
 * @date 7/31/2019 9:41 AM
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle doaw()");
    }
}
