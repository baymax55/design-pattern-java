package designpattern.builderpattern;

/**
 * @author bx
 * @date 8/1/2019 10:40 AM
 */
@FunctionalInterface
public interface FunctionInterface {
    public abstract void demo(String message);
    public static void demo1(){
        System.out.println("static method");
    }
    //函数式接口只能包含一个公有抽象方法
//    public abstract void demo2();

    default void hello(){
        System.out.println("hello");
    }

}
