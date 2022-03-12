package main.designpattern.builderpattern.impl;

import main.designpattern.builderpattern.Packing;

/**
 * @author bx
 * @date 8/1/2019 11:03 AM
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
