package org.star.creational.abstractfactory;

import org.star.creational.abstractfactory.color.Color;
import org.star.creational.abstractfactory.color.ColorType;
import org.star.creational.abstractfactory.factory.AbstractFactory;
import org.star.creational.abstractfactory.factory.FactoryProducer;
import org.star.creational.abstractfactory.factory.FactoryType;
import org.star.creational.abstractfactory.shape.Shape;
import org.star.creational.abstractfactory.shape.ShapeType;

/**
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * <p>
 * 主要解决：主要解决接口选择的问题。
 * <p>
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 * <p>
 * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
 * <p>
 * 关键代码：创建过程在其子类执行。
 * <p>
 * 应用实例： 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。 2、Hibernate 换数据库只需换方言和驱动就可以。
 * <p>
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * <p>
 * 缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 * <p>
 * 使用场景： 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 * <p>
 * 注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //获取形状工场
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.Shape);

        //获取形状为 Circle 的对象，调用 draw 方法
        Shape shape1 = shapeFactory.getShpae(ShapeType.Circle);
        shape1.draw();

        //获取形状为 Rectangle 的对象，调用 draw 方法
        Shape shape2 = shapeFactory.getShpae(ShapeType.Rectangle);
        shape2.draw();

        //获取形状为 Square 的对象，调用 draw 方法
        Shape shape3 = shapeFactory.getShpae(ShapeType.Square);
        shape3.draw();

        //获取颜色工场
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color);

        //获取颜色为 Red 的对象，调用 fill 方法
        Color color1 = colorFactory.getColor(ColorType.Red);
        color1.fill();

        //获取颜色为 Green 的对象，调用 fill 方法
        Color color2 = colorFactory.getColor(ColorType.Green);
        color2.fill();

        //获取颜色为 Blue 的对象，调用 fill 方法
        Color color3 = colorFactory.getColor(ColorType.Blue);
        color3.fill();

    }
}
