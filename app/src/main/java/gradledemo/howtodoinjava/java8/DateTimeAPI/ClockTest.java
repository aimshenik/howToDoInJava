package gradledemo.howtodoinjava.java8.DateTimeAPI;

import java.time.*;

public class ClockTest {
    public static void main(String[] args){
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);                      //SystemClock[Asia/Calcutta]
        System.out.println(clock.instant().toString()); //2013-05-15T06:36:33.837Z
        System.out.println(clock.getZone());            //Asia/Calcutta

        System.out.println("++++" + LocalDateTime.now().toInstant(ZoneOffset.of("+03:00")).toString());

        Clock anotherClock = Clock.system(ZoneId.of("Europe/Tiraspol"));
        System.out.println(anotherClock);                       //SystemClock[Europe/Tiraspol]
        System.out.println(anotherClock.instant().toString());  //2013-05-15T06:36:33.857Z
        System.out.println(anotherClock.getZone());             //Europe/Tiraspol

        Clock forwardedClock  = Clock.tick(anotherClock, Duration.ofSeconds(600));
        System.out.println(forwardedClock.instant().toString());  //2013-05-15T06:30Z
    }
}
