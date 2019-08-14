package designpattern.bridgepattern;

/**
 * @author bx
 * @date 8/6/2019 9:18 AM
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
