package designpattern.decoratorpattern.impl;

import designpattern.decoratorpattern.Shape;
import designpattern.decoratorpattern.ShapeDecorator;

/**
 * @author bx
 * @date 8/8/2019 11:50 AM
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw(){
        shape.draw();
        setRedBorder(shape);
    }
     private void setRedBorder(Shape shape){
         System.out.println("border color : red");
     }
}
