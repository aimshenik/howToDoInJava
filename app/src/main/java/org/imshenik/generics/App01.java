package org.imshenik.generics;

import java.util.HashMap;
import java.util.Map;

public class App01 {
    public static void main(String[] args) {
        Map<String, Number> map = new HashMap<>();

        // !!! Нельзя  Map<String, Number> запихнуть в foobar(Map<String, Object> x)
//        foobar(map); //это вызовет ошибку.

    }

    public static void foobar(Map<String, Object> x){
        // можно просто ставить ? - любой тип.
    }

}
