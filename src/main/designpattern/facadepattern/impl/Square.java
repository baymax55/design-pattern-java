package main.designpattern.facadepattern.impl;

import main.designpattern.facadepattern.Shape;

/**
 * @author bx
 * @date 8/9/2019 11:07 AM
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }
}
