package designpattern.factoryPattern;

/**
 * @author bx
 * @date 7/30/2019 9:18 AM
 */
public interface Shape {
    default void defaultMethod() {
        System.out.println("defaultMethod");
    }

    String name = "baymax";

    void draw();
}
