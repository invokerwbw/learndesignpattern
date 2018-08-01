package org.star.creational.abstractfactory.factory;

import org.star.creational.abstractfactory.color.Color;
import org.star.creational.abstractfactory.color.ColorType;
import org.star.creational.abstractfactory.shape.Shape;
import org.star.creational.abstractfactory.shape.ShapeType;

public abstract class AbstractFactory {

    public abstract Color getColor(ColorType colorType);

    public abstract Shape getShpae(ShapeType shapeType);
}
