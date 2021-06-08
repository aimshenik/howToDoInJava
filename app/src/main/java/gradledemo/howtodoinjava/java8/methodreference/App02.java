package gradledemo.howtodoinjava.java8.methodreference;

import java.util.*;
import java.util.stream.Collectors;

public class App02 {
    public static void main(String[] args){
        Arrays.asList("Andrey","Nitita","Sonya").stream().forEach(s -> System.out.println(s.length()));

        List<String> sortedList = Arrays.asList("One","Two","Three","Four","Five")
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList);


        List<String> sortedList2 = Arrays.asList("One","Two","Three","Four","Five","Alone")
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedList2);

    }

}

