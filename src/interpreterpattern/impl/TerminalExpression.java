package interpreterpattern.impl;

import interpreterpattern.Expression;

/**
 * @author bx
 * @date 8/13/2019 9:39 AM
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
