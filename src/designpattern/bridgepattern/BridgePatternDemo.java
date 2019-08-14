package designpattern.bridgepattern;

import designpattern.bridgepattern.impl.GreenCircle;
import designpattern.bridgepattern.impl.RedCircle;

/**
 * @author bx
 * @date 8/6/2019 9:23 AM
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
