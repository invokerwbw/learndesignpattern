package org.star.creational.factory.shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method.");
    }
}
