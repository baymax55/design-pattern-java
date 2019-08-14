package designpattern.mementopattern;

/**
 * @author bx
 * @date 8/14/2019 11:52 AM
 */
public class Memento {
    private  String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
