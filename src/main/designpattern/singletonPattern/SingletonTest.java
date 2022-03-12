package main.designpattern.singletonPattern;

import java.util.UUID;

/**
 * @author bx
 * @date 7/29/2019 9:49 AM
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (;;) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"###"+Singleton.getInstance());
            }, "baymax_thread"+UUID.randomUUID()).start();
        }
//        while(true){
//            System.out.println(Singleton.getInstance());
//        }
    }
}
