package org.star.creational.singleton;

/**
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * <p>
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * <p>
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * <p>
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * <p>
 * 关键代码：构造函数是私有的。
 * <p>
 * 应用实例： 1、一个党只能有一个书记。 2、Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。 3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。
 * <p>
 * 优点： 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。 2、避免对资源的多重占用（比如写文件操作）。
 * <p>
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 * <p>
 * 使用场景： 1、要求生产唯一序列号。 2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 * <p>
 * 注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
 * <p>
 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        //懒汉式，线程不安全
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.sayHi();

        //懒汉式，线程安全
        SynchronizedLazySingleton synchronizedLazySingleton = SynchronizedLazySingleton.getInstance();
        synchronizedLazySingleton.sayHi();

        //饿汉式
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.sayHi();

        //双检锁/双重校验锁
        DCLSingleton dclSingleton = DCLSingleton.getInstance();
        dclSingleton.sayHi();

        //登记式/静态内部类
        StaticNestedSingleton staticNestedSingleton = StaticNestedSingleton.getInstance();
        staticNestedSingleton.sayHi();

        //枚举
        EnumSingleton.INSTANCE.sayHi();

    }

}
