package gradledemo.howtodoinjava.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App01 {
    public static void main(String[] args){
        App01 _x = new App01();
        List<Integer> list1 = Arrays.asList(1, 2, 5, 455, 3, 22);
        Optional<Integer> max = list1.stream().reduce(_x::comparilka);
        max.ifPresent(integer -> System.out.println(integer));


    }

    private int comparilka(Integer x, Integer y){
        return x >= y ? x : y;
    }
}

