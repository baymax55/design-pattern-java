package main.designpattern.builderpattern.abstracts;

import main.designpattern.builderpattern.Item;
import main.designpattern.builderpattern.Packing;
import main.designpattern.builderpattern.impl.Bottle;

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
