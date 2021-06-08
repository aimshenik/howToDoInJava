package org.imshenik.howtodoinjava.Java8;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Lesson04_Lambda_Expressions {
    public static void main(String[] args) {
//        1) lambda is anonimous function
//        2) lambda may be related to @FunctionalInterface only or interface with 1 abstract method

//        Example 1: Using lambda expression to iterate over a List and perform some action on list elements
        List<String> pointList = new ArrayList<>();
        pointList.add("1");
        pointList.add("2");
        pointList.forEach(p -> {
            System.out.println(p.toUpperCase());
        });


//        Example 2: Using lambda expression to create and start a Thread in Java
        new Thread(() -> System.out.println("My Runnable")).start();

//        Example 3: Using lambda expression for adding an event listener to a GUI component\
        JButton button = new JButton("Submit");
        button.addActionListener(e-> System.out.println("Click event triggered!!!"));
    }
}

