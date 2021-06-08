package org.imshenik.howtodoinjava.Java8.DateTimeAPI;

import java.time.Instant;

public class App00 {
    //https://howtodoinjava.com/java8/date-and-time-api-changes-in-java-8-lambda/
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Instant instant2 = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getNano());
        System.out.println(instant2);
        System.out.println(instant2.getNano());
    }
}
