package main.designpattern.chainofresponsibilutypattern;

/**
 * @author bx
 * @date 8/12/2019 9:17 AM
 */
public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
//        loggerChain.logMessage(AbstractLogger.INFO, "info");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug");
//        loggerChain.logMessage(AbstractLogger.ERROR, "error");
    }
}
