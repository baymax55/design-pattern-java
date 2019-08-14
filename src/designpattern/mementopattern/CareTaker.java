package designpattern.mementopattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bx
 * @date 8/14/2019 11:55 AM
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }

}
