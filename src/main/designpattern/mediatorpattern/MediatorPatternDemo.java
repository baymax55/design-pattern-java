package main.designpattern.mediatorpattern;

/**
 * @author bx
 * @date 8/14/2019 9:31 AM
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
       User robert =  new User("Robert");
       User john =  new User("John");

       robert.sendMessage("hi! John!");
       john.sendMessage("Hello! Robert");
    }
}
