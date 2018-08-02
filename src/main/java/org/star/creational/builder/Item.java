package org.star.creational.builder;

/**
 * 食品条目
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
