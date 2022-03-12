package main.designpattern.decoratorpattern;

/**
 * @author bx
 * @date 8/8/2019 11:47 AM
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

