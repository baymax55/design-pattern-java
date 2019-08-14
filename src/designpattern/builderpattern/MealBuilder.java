package designpattern.builderpattern;

import designpattern.builderpattern.impl.ChickenBurger;
import designpattern.builderpattern.impl.Coke;
import designpattern.builderpattern.impl.Pepsi;
import designpattern.builderpattern.impl.VegBurger;

/**
 * @author bx
 * @date 8/1/2019 11:24 AM
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
       Meal meal= new Meal();
       meal.addItem(new VegBurger());
       meal.addItem(new Coke());
       return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal= new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
