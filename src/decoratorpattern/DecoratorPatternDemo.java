package decoratorpattern;

import decoratorpattern.impl.Circle;
import decoratorpattern.impl.Rectangle;
import decoratorpattern.impl.RedShapeDecorator;

/**
 * @author bx
 * @date 8/8/2019 11:57 AM
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape Circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        Circle.draw();

        System.out.println("\n Circle of red border");
        redCircle.draw();

        System.out.println("\n Rectangle of red border");

        redRectangle.draw();
    }
}
