package main.designpattern.bridgepattern.impl;

import main.designpattern.bridgepattern.DrawAPI;

/**
 * @author bx
 * @date 8/6/2019 9:15 AM
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color:red,redius:" + radius + ",x:" + x + "," + y + "]");
    }
}
