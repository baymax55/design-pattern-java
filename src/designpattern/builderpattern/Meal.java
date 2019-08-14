package designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx
 * @date 8/1/2019 11:17 AM
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost=0.0f;
        for (Item item:items){
            cost+=item.price();
        }
        return cost;
    }
    public void  showItems(){
        for(Item item:items){
            System.out.println("item :" + item.name());
        }
    }
}
