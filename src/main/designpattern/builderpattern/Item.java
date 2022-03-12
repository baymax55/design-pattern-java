package main.designpattern.builderpattern;

/**
 * @author bx
 * @date 8/1/2019 9:51 AM
 */
public interface Item {
    public abstract String name();
    public abstract Packing packing();
    public float price();

    /**
     * java support default method
     */
    default void hello(){
        System.out.println("default methond");
    }
    public final static String name="baymax";

    /**
     * java8支持static method
     */
    public static void helloBaymax (){
        System.out.println("helloBaymax");
    }
}
