package designpattern.frontControllerPattern;

/**
 * @author bx
 * @date 9/16/2019 10:08 PM
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dipatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
