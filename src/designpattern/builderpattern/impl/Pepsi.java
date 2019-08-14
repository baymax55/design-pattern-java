package designpattern.builderpattern.impl;

import designpattern.builderpattern.abstracts.ColdDrink;

/**
 * @author bx
 * @date 8/1/2019 11:15 AM
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
