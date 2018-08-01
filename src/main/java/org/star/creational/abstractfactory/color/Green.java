package org.star.creational.abstractfactory.color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method.");
    }
}
