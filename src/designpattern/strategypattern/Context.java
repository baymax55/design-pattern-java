package designpattern.strategypattern;

/**
 * @author bx
 * @date 8/19/2019 10:39 AM
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
