package main.designpattern.commandpattern.impl;

import main.designpattern.commandpattern.Order;
import main.designpattern.commandpattern.Stock;

/**
 * @author bx
 * @date 8/12/2019 4:27 PM
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
