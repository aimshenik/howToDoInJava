package gradledemo.howtodoinjava.java8.DateTimeAPI;

import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneOffset;

public class CreatingDateObjects {
    public static void main(String[] args){
        //Builder pattern used to make date object
        OffsetDateTime date1 = Year.of(2013)
                .atMonth(Month.MAY).atDay(15)
                .atTime(0, 0)
                .atOffset(ZoneOffset.of("+03:00"));
        System.out.println(date1);                                     //2013-05-15T00:00+03:00

//factory method used to make date object
        OffsetDateTime date2 = OffsetDateTime.
                of(2013, 5, 15, 0, 0, 0, 0, ZoneOffset.of("+03:00"));
        System.out.println(date2);                                      //2013-05-15T00:00+03:00
    }
}
