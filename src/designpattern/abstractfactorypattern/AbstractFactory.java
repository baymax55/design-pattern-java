package designpattern.abstractfactorypattern;

/**
 * @author bx
 * @date 7/31/2019 9:49 AM
 */
public abstract class AbstractFactory {
    private void hello(){
        System.out.println("hello baymax!!!");
    }
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
