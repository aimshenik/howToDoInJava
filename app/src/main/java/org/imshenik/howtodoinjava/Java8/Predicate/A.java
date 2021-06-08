package org.imshenik.howtodoinjava.Java8.Predicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        Predicate<String> predicate = Pattern.compile("^.+@example.com$").asPredicate();
    }
}
