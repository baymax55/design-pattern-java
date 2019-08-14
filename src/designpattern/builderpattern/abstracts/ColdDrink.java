package designpattern.builderpattern.abstracts;

import designpattern.builderpattern.Item;
import designpattern.builderpattern.Packing;
import designpattern.builderpattern.impl.Bottle;

/**
 * @author bx
 * @date 8/1/2019 11:08 AM
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
