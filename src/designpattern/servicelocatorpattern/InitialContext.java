package designpattern.servicelocatorpattern;

import designpattern.servicelocatorpattern.impl.Service1;
import designpattern.servicelocatorpattern.impl.Service2;

/**
 * @author bx
 * @date 9/3/2019 2:49 PM
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("service1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("service2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
