package org.imshenik.howtodoinjava.Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson06_Method_Reference {
    public static void main(String[] args) {


//        https://howtodoinjava.com/java8/lambda-method-references-example/
//        1. Types of method references
//        Java 8 allows four types of method references.

//        Reference to static method
//        Reference to instance method from instance
//        Reference to instance method from class type
//        Reference to constructor

//        2. Method reference to static method – Class::staticMethodName
        List<Integer> l1 = Arrays.asList(1,12,132,4);
        Optional<Integer> max1 = l1.stream().reduce(Math::max); //public static int max(int a, int b)
        max1.ifPresent(value -> System.out.println(value));

//        3. Method reference to instance method from instance – ClassInstance::instanceMethodName
        List<Integer> l2 = Arrays.asList(1,12,132,4);
        Optional<Integer> max2 = l1.stream().reduce(Math::max);
        max2.ifPresent(value -> System.out.println(value)); // Here

//        Method reference to instance method from class type – Class::instanceMethodName
        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");
        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println(sorted);
        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo) // (s1, s2) -> s1.compareTo(s2) REPLACED BY String::compareTo
                .collect(Collectors.toList());

        System.out.println(sortedAlt);

//        5. Reference to constructor – Class::new
        List<Integer> list = IntStream
                .range(1,100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Set<Integer> myInts = IntStream.range(100,110).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(myInts);

    }
}

