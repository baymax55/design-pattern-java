package main.stringdemo.string;

/**
 * @author bx
 * @date 8/6/2019 4:21 PM
 */
public class StringDemo1 {
    public static void main(String[] args) {
    }

    //String AB = A+B;首先会在堆中创建一个StringBuilder对象，并将A作为初始化的值；再通过append()方法合并B的值，最后再通过toString()方法在堆中创建一个String对象，将堆地址存放在AB中。
    //“123”+“456”；在编译期就会自动合并为“123456”，所以D与F指向的是同一个地址。
    private static void StringDemo() {
        String A = "123";
        String B = "456";
        String AB = A+B;
        String C = "123456";
        System.out.println(AB==C);

        String D = "123"+"456";
        String F = "123456";
        System.out.println(D==F);
    }
}
