package designpattern.builderpattern;

/**
 * @author bx
 * @date 8/1/2019 10:48 AM
 */
public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("hello");
        }).start();
    }
}
