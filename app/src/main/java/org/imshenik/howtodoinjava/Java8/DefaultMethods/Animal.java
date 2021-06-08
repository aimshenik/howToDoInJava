package org.imshenik.howtodoinjava.Java8.DefaultMethods;

import org.imshenik.sandbox.A;

public class Animal implements Walkable, Moveable {
    public static void main(String[] args) {
        Animal tiger = new Animal();
    }

    @Override
    public void move() {
        Walkable.super.move();
    }
}
