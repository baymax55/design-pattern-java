package designpattern.builderpattern.impl;

import designpattern.builderpattern.Packing;

/**
 * @author bx
 * @date 8/1/2019 11:04 AM
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
