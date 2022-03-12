package main.designpattern.builderpattern.impl;

import main.designpattern.builderpattern.abstracts.Burger;

/**
 * @author bx
 * @date 8/1/2019 11:13 AM
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
