package main.designpattern.proxypattern;

/**
 * @author bx
 * @date 8/10/2019 11:44 PM
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("baymax.jpg");

        //need to load
        image.display();
        System.out.println("####");
        //doesn't to load
        image.display();


    }
}
