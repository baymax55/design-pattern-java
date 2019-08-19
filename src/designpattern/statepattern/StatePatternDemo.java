package designpattern.statepattern;

import designpattern.statepattern.impl.StartState;
import designpattern.statepattern.impl.StopState;

/**
 * @author bx
 * @date 8/19/2019 10:20 AM
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
