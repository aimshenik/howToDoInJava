package org.imshenik.howtodoinjava.Java8;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.*;

public class Lesson03_Java_Boxed_Stream_Example {
    public static void main(String[] args) {
//        1. What is a Boxed Stream?
        System.out.println("1 : +++++++++++++++++++++++++++++++");
//        It works perfectly!!
        List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());
        System.out.println(strings);
//        doesn’t work on streams of primitives.
//        IntStream.of(1,2,3,4,5).collect(Collectors.toList()); //compile error

//        2. IntStream (Stream of int)
//        To convert a stream of primitives, we must first box
        System.out.println("2 : +++++++++++++++++++++++++++++++");
        List<Integer> list1 = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list1);

//        3. LongStream (Stream of long)
        System.out.println("3 : +++++++++++++++++++++++++++++++");
        List<Long> longs = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed().collect(Collectors.toList());
        System.out.println(longs);

//        4. DoubleStream (Stream of double)
        System.out.println("4 : +++++++++++++++++++++++++++++++");
        List<Double> doubles = DoubleStream.of(1d, 2d, 3d, 4d, 5d)
                .boxed().collect(Collectors.toList());
        System.out.println(doubles);

//        Example from comments - how to convert array of arrays of primitives
//        to  List<List<Integer>>
        Object[] objArrayOfIntArrays1 = new Object[]{
                new int[]{1, 2}, // add 2
                new int[]{1, 2}, // add 2
                new int[]{3, 2}, // query freq 2
                new int[]{2, 2}, // delete 2
                new int[]{3, 2}, // query freq 2
        };

        List<List<Integer>> primitiveList = Arrays
                .stream(objArrayOfIntArrays1)
                .map(q -> Arrays.stream((int[]) q)
                        .boxed()
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(primitiveList);

    }
}

