package designpattern.strategypattern.impl;

import designpattern.strategypattern.Strategy;

/**
 * @author bx
 * @date 8/19/2019 10:37 AM
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
