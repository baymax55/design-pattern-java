package flyweightpattern;

import flyweightpattern.impl.Circle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bx
 * @date 8/9/2019 3:45 PM
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new ConcurrentHashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("create circle of color : " + color);
        }
        return circle;

    }
}
