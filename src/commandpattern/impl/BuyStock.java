package commandpattern.impl;

import commandpattern.Order;
import commandpattern.Stock;

/**
 * @author bx
 * @date 8/12/2019 4:27 PM
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
