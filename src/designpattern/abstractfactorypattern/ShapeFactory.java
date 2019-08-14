package designpattern.abstractfactorypattern;

import designpattern.abstractfactorypattern.impl.Circle;
import designpattern.abstractfactorypattern.impl.Rectangle;
import designpattern.abstractfactorypattern.impl.Square;

/**
 * @author bx
 * @date 7/31/2019 9:52 AM
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
