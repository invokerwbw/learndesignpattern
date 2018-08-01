package org.star.creational.abstractfactory.factory;

import org.star.creational.abstractfactory.color.Color;
import org.star.creational.abstractfactory.color.ColorType;
import org.star.creational.abstractfactory.shape.*;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Shape getShpae(ShapeType shapeType) {
        if (ShapeType.Rectangle.equals(shapeType)) {
            return new Rectangle();
        }
        if (ShapeType.Square.equals(shapeType)) {
            return new Square();
        }
        if (ShapeType.Circle.equals(shapeType)) {
            return new Circle();
        }
        return null;
    }
}
