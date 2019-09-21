package designpattern.factoryPattern;

/**
 * @author bx
 * @date 7/30/2019 10:35 AM
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

    }
}
