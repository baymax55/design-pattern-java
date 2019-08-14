package designpattern.builderpattern.abstracts;

import designpattern.builderpattern.Item;
import designpattern.builderpattern.Packing;
import designpattern.builderpattern.impl.Wrapper;

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
