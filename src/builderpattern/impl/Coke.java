package builderpattern.impl;

import builderpattern.abstracts.ColdDrink;

/**
 * @author bx
 * @date 8/1/2019 11:14 AM
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 30.f;
    }
}
