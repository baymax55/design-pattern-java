package main.designpattern.strategypattern;

import main.designpattern.strategypattern.impl.OperationAdd;
import main.designpattern.strategypattern.impl.OperationMultiply;
import main.designpattern.strategypattern.impl.OperationSubstract;

/**
 * @author bx
 * @date 8/19/2019 10:41 AM
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10+5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10-5=" + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10*5=" + context.executeStrategy(10, 5));
    }
}
