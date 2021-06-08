package org.imshenik.howtodoinjava.Java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Lesson00NewDateTimeApiExamples {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Instant instant1 = instant.plus(Duration.ofMillis(5000));
        Instant instant2 = instant.minus(Duration.ofMillis(5000));
        Instant instant3 = instant.minusSeconds(10);
        System.out.println(instant.toString());
        System.out.println(instant1.toString());
        System.out.println(instant2.toString());
        System.out.println(instant3.toString());

        Duration duration = Duration.ofMillis(5000);
        System.out.println(duration);

        Period period = Period.between(LocalDate.now(), LocalDate.now().minusDays(50));
        System.out.println(period);

    }
}
