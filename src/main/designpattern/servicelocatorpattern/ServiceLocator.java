package main.designpattern.servicelocatorpattern;

/**
 * @author bx
 * @date 9/3/2019 2:58 PM
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }
        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
