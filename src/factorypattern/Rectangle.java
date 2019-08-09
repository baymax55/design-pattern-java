package factorypattern;

/**
 * @author bx
 * @date 7/30/2019 10:21 AM
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
