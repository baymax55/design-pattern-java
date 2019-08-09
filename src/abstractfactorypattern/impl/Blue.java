package abstractfactorypattern.impl;

import abstractfactorypattern.Color;

/**
 * @author bx
 * @date 7/31/2019 9:46 AM
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("blue fill()");
    }
}
