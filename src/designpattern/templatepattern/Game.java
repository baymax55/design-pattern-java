package designpattern.templatepattern;

/**
 * @author bx
 * @date 8/20/2019 9:57 AM
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
