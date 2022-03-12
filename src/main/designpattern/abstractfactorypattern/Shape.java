package main.designpattern.abstractfactorypattern;

/**
 * @author bx
 * @date 7/31/2019 9:14 AM
 */
public interface Shape {
    public static final int age = 25;

    default void defaultMethod() {
        System.out.println("defauleMethod call");
    }

    void draw();
}
