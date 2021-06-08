package org.imshenik.howtodoinjava.Java8;

public class Lesson07_Default_Method implements Moveable{
    public static void main(String[] args) {
        Lesson07_Default_Method animal = new Lesson07_Default_Method();
        animal.move();
    }

    @Override
    public void move() {

    }
}

interface Moveable {
    default void move(){
        System.out.println("I am moving");
    }
}