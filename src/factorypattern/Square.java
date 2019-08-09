package factorypattern;

/**
 * @author bx
 * @date 7/30/2019 10:25 AM
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
