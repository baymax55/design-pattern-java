package designpattern.chainofresponsibilutypattern;

/**
 * @author bx
 * @date 8/12/2019 9:13 AM
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard consloe::logger:" + message);
    }
}
