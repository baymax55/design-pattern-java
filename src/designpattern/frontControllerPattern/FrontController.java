package designpattern.frontControllerPattern;

/**
 * @author bx
 * @date 9/16/2019 10:10 PM
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("page requested:" + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            dispatcher.dipatch(request);
        }
    }
}
