package org.star.creational.abstractfactory.factory;

import org.star.creational.abstractfactory.factory.AbstractFactory;
import org.star.creational.abstractfactory.factory.ColorFactory;
import org.star.creational.abstractfactory.factory.FactoryType;
import org.star.creational.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (FactoryType.Color.equals(factoryType)) {
            return new ColorFactory();
        }
        if (FactoryType.Shape.equals(factoryType)) {
            return new ShapeFactory();
        }
        return null;
    }
}
