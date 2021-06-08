package org.imshenik.sandbox;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        byte[] bytes = "A".getBytes(StandardCharsets.US_ASCII);
        byte[] bytes2 = "Б".getBytes(StandardCharsets.UTF_16BE);
        byte[] bytes3 = "Б".getBytes(StandardCharsets.UTF_16LE);
        byte[] bytesUTF8 = "w".getBytes(StandardCharsets.UTF_8);

//        System.out.println(Integer.toBinaryString('А'));
//        System.out.println(Integer.toBinaryString('A'));
//        System.out.println((int)'А');
//        System.out.println(Arrays.toString("A".toCharArray()));

        String FIX = "8=FIX.4.2\u00019=61\u000135=0\u000134=28\u000149=BANZAI\u000152=20210521-08:49:11.759\u000156=FIXIMULATOR\u000110=028\u0001";
        String SOH = "\u0001";
        System.out.println("!!!!!!!!!!!!!!!");
        System.out.println(SOH);
        System.out.println("!!!!!!!!!!!!!!!");


        byte[] _bytes = "Б".getBytes(StandardCharsets.US_ASCII);
        System.out.println(Arrays.toString(_bytes));
        _bytes = "Б".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(_bytes));
        System.out.println(new String(_bytes, StandardCharsets.UTF_8));

        System.out.println(StandardCharsets.US_ASCII.aliases());
        System.out.println("++++");
        System.out.println(Charset.availableCharsets());
        System.out.println("++++");
        System.out.println(Charset.availableCharsets().get("GB18030"));

//        System.out.println(new String(bytes2, StandardCharsets.UTF_8));
//        String s = new String(bytes, StandardCharsets.US_ASCII);
//        System.out.println(s);
    }
}
