package main.designpattern.bridgepattern;

/**
 * @author bx
 * @date 8/6/2019 9:19 AM
 */
public class Circle extends Shape {
    private int x, y, radius;

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }
}
