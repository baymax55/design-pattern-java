package designpattern.prototypepattern;

/**
 * @author bx
 * @date 8/2/2019 11:26 AM
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getId());
    }
}
