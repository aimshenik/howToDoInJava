package gradledemo.howtodoinjava.java8.DateTimeAPI;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class App00 {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek().toString());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.plusDays(50).getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MAX.plusNanos(1L).minusNanos(1L));
//Instant
        Instant instant = Instant.now();
        System.out.println(instant.toString());
        System.out.println(instant.plus(Duration.ofMillis(5000)).toString());
        System.out.println(instant.minus(Duration.ofMillis(5000)).toString());
        System.out.println(instant.minusSeconds(10).toString());
//PEriod
        Period period = Period.ofDays(6);
        System.out.println(period.toString());    //P6D
        period = Period.ofMonths(6);
        System.out.println(period.toString());    //P6M
        period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
        System.out.println(period.toString());   //P1M29D



    }
}
