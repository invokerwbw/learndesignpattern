package org.star.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
}
