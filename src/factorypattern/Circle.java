package factorypattern;

/**
 * @author bx
 * @date 7/30/2019 10:26 AM
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
