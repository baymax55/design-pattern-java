package designpattern.interpreterpattern;

import designpattern.interpreterpattern.impl.AndExpression;
import designpattern.interpreterpattern.impl.OrExpression;
import designpattern.interpreterpattern.impl.TerminalExpression;

/**
 * @author bx
 * @date 8/13/2019 9:44 AM
 */
public class InterpreterPatternDemo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedExpression() {
        Expression julie = new TerminalExpression("Juile");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedExpression();

        System.out.println("John is male?" + isMale.interpret("John"));
        System.out.println("Juile is a married womam?" + isMarriedWoman.interpret("Married Juile"));
    }
}
