package org.star.creational.builder;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return this.getClass().getSimpleName();
    }
}
