package designpattern.InterceptingFilterPattern;

/**
 * @author bx
 * @date 9/16/2019 9:17 PM
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request:" + request);
    }
}
