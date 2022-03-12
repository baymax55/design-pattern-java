package main.designpattern.templatepattern;

/**
 * @author bx
 * @date 8/20/2019 10:04 AM
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Circket();
        game.play();
        System.out.println("#####");
        game = new Football();
        game.play();
    }
}
