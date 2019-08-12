package commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx
 * @date 8/12/2019 4:32 PM
 */
public class Broker {
    private List<Order> orderList=new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
