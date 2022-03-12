package main.designpattern.templatepattern;

/**
 * @author bx
 * @date 8/20/2019 9:59 AM
 */
public class Circket extends Game {
    @Override
    void initialize() {
        System.out.println("Circket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Circket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Circket Game Finished!");
    }
}
