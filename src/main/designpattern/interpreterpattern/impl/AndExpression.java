package main.designpattern.interpreterpattern.impl;

import main.designpattern.interpreterpattern.Expression;

/**
 * @author bx
 * @date 8/13/2019 9:39 AM
 */
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
