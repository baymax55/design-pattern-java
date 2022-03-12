package main.designpattern.facadepattern;

import main.designpattern.facadepattern.impl.Circle;
import main.designpattern.facadepattern.impl.Rectangle;
import main.designpattern.facadepattern.impl.Square;

/**
 * @author bx
 * @date 8/9/2019 11:09 AM
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
