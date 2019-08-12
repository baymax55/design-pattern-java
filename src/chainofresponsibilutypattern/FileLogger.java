package chainofresponsibilutypattern;

/**
 * @author bx
 * @date 8/12/2019 9:13 AM
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File consloe::logger:" + message);
    }
}
