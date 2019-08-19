package designpattern.statepattern;

/**
 * @author bx
 * @date 8/19/2019 9:43 AM
 */
public class Context {
    private State state;

    public Context() {
        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
