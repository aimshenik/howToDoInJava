package org.imshenik.howtodoinjava.Java8;

public class FunctionalInterfaceUsageExample {
    public static void main(String[] args) {
        new Pen().paint(() -> {
            System.out.println("PEN IS PAINTING");
        });
    }
}

class Pen{
    public static void paint(MyFirstFunctionalInterface i){};
}