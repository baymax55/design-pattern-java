package main.designpattern.prototypepattern;

/**
 * @author bx
 * @date 8/2/2019 11:10 AM
 */
public class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle inside:: draw()");
    }

    public Rectangle() {
        type="Rectangle";
    }
}
