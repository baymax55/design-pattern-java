package designpattern.bridgepattern.impl;

import designpattern.bridgepattern.DrawAPI;

/**
 * @author bx
 * @date 8/6/2019 9:15 AM
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:green,redius:" + radius + ",x:" + x + "," + y + "]");
    }
}
