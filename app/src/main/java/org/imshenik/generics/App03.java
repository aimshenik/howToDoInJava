package org.imshenik.generics;

import java.util.ArrayList;
import java.util.List;

public class App03 {
    public static void main(String[] args) {
        List<? super Integer> list1 = new ArrayList<Integer>();
        List<? super Integer> list2 = new ArrayList<Number>();
        List<? super Integer> list3 = new ArrayList<Object>();

//        В такой ситуации все обстоит с точностью наоборот.
//        Мы можем без приведения типов присовить значение из листа только ссылочной переменной типа Object,
//        но зато запись в лист доступна для всех наследников типа Integer.

        list1.add(new Integer(1));
        list2.add(new Integer(2));
        list3.add(new Integer(3));
    }
}
