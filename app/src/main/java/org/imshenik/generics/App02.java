package org.imshenik.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App02 {
    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<Number>();
        List<? extends Number> list2 = new ArrayList<Integer>();
        List<? extends Number> list3 = new ArrayList<Double>();

//      А теперь, как вы думаете, что мы можем записать в list с таким объявлением?
//      Если вы ответили — Number и его любого наследника, то вы ошиблись.
//      Ответ — ничего! Причина этому в том, что объявленный так лист на самом деле может быть как листом Number,
//      так и листом Integer, Double, да и вообще любого наследника Number и поэтому неизвестно какой именно
//      тип там храниться и что именно туда можно записать.

//        list2.add(new Integer(1));
    }
}
