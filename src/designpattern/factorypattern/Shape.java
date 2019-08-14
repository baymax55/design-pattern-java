package designpattern.factorypattern;

/**
 * @author bx
 * @date 7/30/2019 9:18 AM
 */
public interface Shape {
    default void defaultMethod(){
        System.out.println("defaultMethod");
    }
    public static final int age=25;
    String name="baymax";
    public abstract void draw();
}
