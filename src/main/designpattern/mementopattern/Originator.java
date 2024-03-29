package main.designpattern.mementopattern;

/**
 * @author bx
 * @date 8/14/2019 11:53 AM
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
