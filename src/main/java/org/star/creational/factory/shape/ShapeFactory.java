package org.star.creational.factory.shape;

import org.star.creational.factory.shape.Circle;
import org.star.creational.factory.shape.Rectangle;
import org.star.creational.factory.shape.Shape;
import org.star.creational.factory.shape.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
