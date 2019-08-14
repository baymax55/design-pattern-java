package designpattern.abstractfactorypattern.impl;

import designpattern.abstractfactorypattern.Color;

/**
 * @author bx
 * @date 7/31/2019 9:45 AM
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red fill()");
    }
}
