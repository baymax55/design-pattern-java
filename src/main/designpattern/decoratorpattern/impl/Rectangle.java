package main.designpattern.decoratorpattern.impl;

import main.designpattern.decoratorpattern.Shape;

/**
 * @author bx
 * @date 8/8/2019 11:45 AM
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
