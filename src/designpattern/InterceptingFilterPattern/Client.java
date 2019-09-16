package designpattern.InterceptingFilterPattern;

/**
 * @author bx
 * @date 9/16/2019 9:41 PM
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
