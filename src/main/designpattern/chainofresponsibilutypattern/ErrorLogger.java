package main.designpattern.chainofresponsibilutypattern;

/**
 * @author bx
 * @date 8/12/2019 9:13 AM
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error consloe::logger:" + message);
    }
}
