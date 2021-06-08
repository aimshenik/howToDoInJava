package gradledemo.howtodoinjava.java8.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DateAdjusters {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2013, Month.MAY, 15);
        LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(endOfMonth.toString());
        LocalDate nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTue.toString());
    }
}
