package prototypepattern;

/**
 * @author bx
 * @date 8/2/2019 11:13 AM
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("inside Suqare :: draw()");
    }

    public Square() {
        type="Square";
    }
}
