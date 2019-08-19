package designpattern.statepattern.impl;

import designpattern.statepattern.Context;
import designpattern.statepattern.State;

/**
 * @author bx
 * @date 8/19/2019 9:45 AM
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
