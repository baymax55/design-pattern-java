package main.designpattern.prototypepattern;

/**
 * @author bx
 * @date 8/2/2019 11:13 AM
 */
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("inside Circle :: draw()");
    }

    public Circle() {
        type="Circle";
    }
}
