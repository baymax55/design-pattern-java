package designpattern.abstractfactorypattern;

import designpattern.abstractfactorypattern.impl.Blue;
import designpattern.abstractfactorypattern.impl.Green;
import designpattern.abstractfactorypattern.impl.Red;

/**
 * @author bx
 * @date 7/31/2019 9:56 AM
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("grenn")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
