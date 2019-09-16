package designpattern.InterceptingFilterPattern.impl;

import designpattern.InterceptingFilterPattern.Filter;

/**
 * @author bx
 * @date 9/16/2019 9:14 PM
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request:" + request);
    }
}
