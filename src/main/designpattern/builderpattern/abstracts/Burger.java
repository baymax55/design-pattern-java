package main.designpattern.builderpattern.abstracts;

import main.designpattern.builderpattern.Item;
import main.designpattern.builderpattern.Packing;
import main.designpattern.builderpattern.impl.Wrapper;

/**
 * @author bx
 * @date 8/1/2019 10:00 AM
 */
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
