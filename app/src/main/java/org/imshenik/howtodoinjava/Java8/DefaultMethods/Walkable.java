package org.imshenik.howtodoinjava.Java8.DefaultMethods;

public interface Walkable {
    default void move() {
        System.out.println("Walking");
    }
}
