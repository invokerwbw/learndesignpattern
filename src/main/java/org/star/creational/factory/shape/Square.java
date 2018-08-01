package org.star.creational.factory.shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method.");
    }
}
