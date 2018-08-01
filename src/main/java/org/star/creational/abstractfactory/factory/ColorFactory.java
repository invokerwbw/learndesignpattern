package org.star.creational.abstractfactory.factory;

import org.star.creational.abstractfactory.color.*;
import org.star.creational.abstractfactory.shape.Shape;
import org.star.creational.abstractfactory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(ColorType colorType) {
        if (ColorType.Red.equals(colorType)) {
            return new Red();
        }
        if (ColorType.Green.equals(colorType)) {
            return new Green();
        }
        if (ColorType.Blue.equals(colorType)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShpae(ShapeType shapeType) {
        return null;
    }
}
