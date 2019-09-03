package designpattern.servicelocatorpattern.impl;

import designpattern.servicelocatorpattern.Service;

/**
 * @author bx
 * @date 9/3/2019 2:46 PM
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Server1");
    }
}
