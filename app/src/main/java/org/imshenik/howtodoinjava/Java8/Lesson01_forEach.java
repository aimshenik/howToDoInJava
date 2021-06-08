package org.imshenik.howtodoinjava.Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lesson01_forEach {
    public static void main(String[] args) {
//        iterableForeachTest();
//        consumerExample();
//        mapForEachTest();
//        ownConsumerTest();
        sequentialStreamDemo();
        parallelStreamExample();
        parallelStreamWithOrderedIteration();
    }


    public static void iterableForeachTest() {
        List<String> names = Arrays.asList("Alex", "Brian", "Charles");
        names.forEach(System.out::println);
    }

    public static void consumerExample() {
        List<String> names = Arrays.asList("Alex", "Brian", "Charles");

        Consumer<String> makeUpperCase = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t.toUpperCase());
            }
        };

        names.forEach(makeUpperCase);
    }

    public static void mapForEachTest() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "charles");

        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {

            @Override
            public void accept(String o, String o2) {
                System.out.println(o + " | " + o2);
            }
        };

        map.forEach(biConsumer);
    }

    public static void ownConsumerTest() {
        OwnConsumer<Integer> ownConsumer = new OwnConsumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(Integer.toBinaryString(integer));
                System.out.println(integer.hashCode());
            }
        };

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.forEach(ownConsumer);
    }

    public static void sequentialStreamDemo() {
        //taken from
        //https://www.geeksforgeeks.org/parallel-vs-sequential-stream-in-java/

        // create a list
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // we are using stream() method
        // for sequential stream
        // Iterate and print each element
        // of the stream
        list.stream().forEach(System.out::print);
    }

    public static void parallelStreamExample() {
        //taken from
        //https://www.geeksforgeeks.org/parallel-vs-sequential-stream-in-java/

        // create a list
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
        list.parallelStream().forEach(System.out::print);
    }

    public static void parallelStreamWithOrderedIteration() {
        //taken from
        //https://www.geeksforgeeks.org/parallel-vs-sequential-stream-in-java/

        // create a list
        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");

        // using parallelStream()
        // method for parallel stream
        list.parallelStream().forEachOrdered(System.out::print);
    }
}

class Printer {
    public static void print(Object o) {
        System.out.println("FROMPRINT | " + o.toString());
    }
}