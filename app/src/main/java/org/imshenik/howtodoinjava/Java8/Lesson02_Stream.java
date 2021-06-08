package org.imshenik.howtodoinjava.Java8;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson02_Stream {
    public static void main(String[] args) {
        //Stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.print("|" + p));

        //Stream.of(array)
        Stream<Integer> stream2 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        stream2.forEach(p -> System.out.print("/" + p));

        //List.stream()
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Stream<Integer> stream3 = list.stream();
        stream3.forEach(x -> System.out.print("?" + x));

        //Stream.generate() or Stream.iterate()
        System.out.println();
        Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt(100));
        randomNumbers.limit(20)
                .forEach(System.out::print);

        //Stream of String chars or tokens
        System.out.print("\r");
        IntStream streamChars = "12345_abcdefg".chars();
        streamChars.forEach(c -> System.out.print(";" + c));
        System.out.print("\r");
        Stream<String> stream4 = Stream.of("A$B$C$D$E$F".split("\\$"));
        stream4.forEach(System.out::print);

//        3. Stream Collectors
//        3.1. Collect Stream elements to a List
        System.out.print("3.1 : ");
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(i);
        }
        Stream<Integer> stream5 = list2.stream();
        List<Integer> evenNumbers = stream5.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

//        3.2. Collect Stream elements to an Array
        System.out.print("3.2 : ");
        List<Integer> listOfInts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfInts.add(i);
        }
        Stream<Integer> streamOfIntegers = listOfInts.stream();
        Integer[] evenNumbersArray = streamOfIntegers
                .filter(x -> x % 2 == 0)
                .toArray(Integer[]::new); //"Integer[]::new" то же самое что и "x -> {return new Integer[x];}"
        System.out.println(Arrays.toString(evenNumbersArray));

//      4. Stream Operations
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
//        4.1. Intermediate Operations
//        4.1.1. Stream.filter()
        System.out.println("4.1.1 : +++++++++++++++++++++++++++++++");
        memberNames.stream().filter(s -> s.startsWith("A"))
                .forEach(System.out::println);
//        4.1.2. Stream.map()
        System.out.println("4.1.2 : +++++++++++++++++++++++++++++++");
        memberNames.stream().filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
//        4.1.3. Stream.sorted()
        System.out.println("4.1.3 : +++++++++++++++++++++++++++++++");
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        4.2. Terminal operations
//        4.2.1. Stream.forEach()
        System.out.println("4.2.1 : +++++++++++++++++++++++++++++++");
        memberNames.forEach(System.out::println);
//        4.2.2. Stream.collect()
        System.out.println("4.2.2 : +++++++++++++++++++++++++++++++");
        List<String> uppercaseNames = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseNames);
//        4.2.3. Stream.match()
        System.out.println("4.2.3 : +++++++++++++++++++++++++++++++");
        boolean matchResult = memberNames.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);
        matchResult = memberNames.stream().allMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);
        matchResult = memberNames.stream().noneMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);
//        4.2.4. Stream.count()
        System.out.println("4.2.4 : +++++++++++++++++++++++++++++++");
        long totalMatched = memberNames.stream().filter(s -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);
//        4.2.5. Stream.reduce()
        System.out.println("4.2.5 : +++++++++++++++++++++++++++++++");
        Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> {
            return s1 + " | " + s2;
        });
        reduced.ifPresent(System.out::println);

//        5. Stream Short-circuit Operations
//        5.1. Stream.anyMatch()
        System.out.println("5.1 : +++++++++++++++++++++++++++++++");
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A")); //anyMatch will break iteration after 1st TRUE
        System.out.println(matched);
//        5.2. Stream.findFirst()
        System.out.println("5.2 : +++++++++++++++++++++++++++++++");
        String firstMatchedName = memberNames.stream().filter(s -> s.startsWith("L"))
                .findFirst().get();
        System.out.println(firstMatchedName);
//        6. Parallelism in Java Steam
        System.out.println("6 : +++++++++++++++++++++++++++++++");
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            listOfIntegers.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> streamofIntegetrs = listOfIntegers.parallelStream();
        Integer[] evenNumbersOfStream = streamofIntegetrs.filter(x -> x%2==0).toArray(x->{return new Integer[x];});
        System.out.println(Arrays.toString(evenNumbersOfStream));
    }
}

