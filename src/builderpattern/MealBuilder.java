package builderpattern;

import builderpattern.impl.ChickenBurger;
import builderpattern.impl.Coke;
import builderpattern.impl.Pepsi;
import builderpattern.impl.VegBurger;

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
