package designpattern.InterceptingFilterPattern;

import designpattern.InterceptingFilterPattern.impl.AuthenticationFilter;
import designpattern.InterceptingFilterPattern.impl.DebugFilter;

/**
 * @author bx
 * @date 9/16/2019 9:43 PM
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager=new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
