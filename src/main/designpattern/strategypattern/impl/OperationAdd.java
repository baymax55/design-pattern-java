package main.designpattern.strategypattern.impl;

import main.designpattern.strategypattern.Strategy;

/**
 * @author bx
 * @date 8/19/2019 10:37 AM
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
