package org.imshenik.generics;

import java.util.HashMap;
import java.util.Map;

public class App00{
    public static void main(String[] args) {
        Map<String, Number> map = new HashMap<>();
        foobar(map);

    }

    public static void foobar(Map<String, ?> x){
        // можно просто ставить ? - любой тип.
    }

}
