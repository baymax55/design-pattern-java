package designpattern.abstractfactorypattern;

/**
 * @author bx
 * @date 7/31/2019 10:07 AM
 */
public class AbstarctFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
