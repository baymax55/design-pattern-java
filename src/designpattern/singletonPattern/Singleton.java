package designpattern.singletonPattern;

/**
 * @author bx
 * @date 7/29/2019 9:44 AM
 */
public class Singleton {
    //    private static Singleton singleton=new Singleton();
//    private static volatile Singleton singleton;

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
        return SingletonHolder.instance;
    }
}
