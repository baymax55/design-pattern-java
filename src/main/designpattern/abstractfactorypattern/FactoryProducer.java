package main.designpattern.abstractfactorypattern;

/**
 * @author bx
 * @date 7/31/2019 10:03 AM
 */
public class FactoryProducer {
    public FactoryProducer() {
    }

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
