package main.designpattern.statepattern.impl;

import main.designpattern.statepattern.Context;
import main.designpattern.statepattern.State;

/**
 * @author bx
 * @date 8/19/2019 9:45 AM
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
