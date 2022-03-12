package main.designpattern.frontControllerPattern;

/**
 * @author bx
 * @date 9/16/2019 10:16 PM
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
       FrontController frontController= new FrontController();
       frontController.dispatchRequest("HOME");
       frontController.dispatchRequest("STUDENT");
    }
}
