package main.designpattern.commandpattern;

import main.designpattern.commandpattern.impl.BuyStock;
import main.designpattern.commandpattern.impl.SellStock;

/**
 * @author bx
 * @date 8/12/2019 4:35 PM
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
