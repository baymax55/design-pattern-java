package designpattern.builderpattern;

/**
 * @author bx
 * @date 8/1/2019 11:27 AM
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
       MealBuilder mealBuilder= new MealBuilder();
       Meal vegMeal =  mealBuilder.prepareNonVegMeal();
        System.out.println("veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());
    }
}
