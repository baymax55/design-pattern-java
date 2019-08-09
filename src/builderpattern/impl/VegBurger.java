package builderpattern.impl;

import builderpattern.abstracts.Burger;

/**
 * @author bx
 * @date 8/1/2019 11:10 AM
 */
//vegetable vegetable 蔬菜
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "vegetable burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
