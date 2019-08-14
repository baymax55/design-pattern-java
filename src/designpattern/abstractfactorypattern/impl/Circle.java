package designpattern.abstractfactorypattern.impl;

import designpattern.abstractfactorypattern.Shape;

/**
 * @author bx
 * @date 7/31/2019 9:44 AM
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("circle draw()");
    }
}
