package org.imshenik.howtodoinjava.Java8.DefaultMethods;

public interface Moveable {
    default void move() {
        System.out.println("I am moving");
    }
}