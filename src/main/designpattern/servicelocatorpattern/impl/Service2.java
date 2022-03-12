package main.designpattern.servicelocatorpattern.impl;

import main.designpattern.servicelocatorpattern.Service;

/**
 * @author bx
 * @date 9/3/2019 2:46 PM
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Server2");
    }
}
