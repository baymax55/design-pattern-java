package main.designpattern.abstractfactorypattern.impl;

import main.designpattern.abstractfactorypattern.Color;

/**
 * @author bx
 * @date 7/31/2019 9:45 AM
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("grenn fill()");
    }
}
