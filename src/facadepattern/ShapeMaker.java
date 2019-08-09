package facadepattern;

import facadepattern.impl.Circle;
import facadepattern.impl.Rectangle;
import facadepattern.impl.Square;

import java.util.Queue;

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
