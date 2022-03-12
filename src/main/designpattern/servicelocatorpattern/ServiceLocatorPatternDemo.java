package main.designpattern.servicelocatorpattern;

/**
 * @author bx
 * @date 9/3/2019 3:01 PM
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
        service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
    }
}
