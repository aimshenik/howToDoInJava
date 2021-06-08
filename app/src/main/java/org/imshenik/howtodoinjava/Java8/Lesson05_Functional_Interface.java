package org.imshenik.howtodoinjava.Java8;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson05_Functional_Interface {
    public static void main(String[] args) {
//        Functional Interfaces = SAM Interfaces  = Single Abstract Method Interfaces
//        @FunctionalInterface

//        Do’s and Don’t’s in functional interfaces
//        Since default methods are not abstract you’re free to add default methods to your functional interface as many as you like.

//        If an interface declares an abstract method overriding one of the public methods of java.lang.Object,
//        that also does not count toward the interface’s abstract method count since any implementation of the
//        interface will have an implementation from java.lang.Object or elsewhere. e.g. Comparator is a functional
//        interface even though it declared two abstract methods. Why? Because one of these abstract methods “equals()”
//        which has signature equal to public method in Object class.
        Comparator<String> comparator;
        Object t;

    }


}

