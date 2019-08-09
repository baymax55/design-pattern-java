package factorypattern;

/**
 * @author bx
 * @date 7/30/2019 10:28 AM
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("suqare")) {
            return new Square();
        }
        return null;
    }
}
