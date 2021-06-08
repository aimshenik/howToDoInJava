package org.imshenik.sandbox;

import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        try {
//            System.out.println(convertToBinary(" ", "UTF-8"));
//            System.out.println(convertToBinary("Ǡ", "UTF-8"));
//            System.out.println(convertToBinary("T", "UTF-8"));

            double x = 0.1;
            System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(x)));
            System.out.println(Double.doubleToRawLongBits(x));
            System.out.println(x);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String convertToBinary(String input, String encoding)
            throws Exception {
        byte[] encoded_input = Charset.forName(encoding)
                .encode(input)
                .array();
        return IntStream.range(0, encoded_input.length)
                .map(i -> encoded_input[i])
                .mapToObj(e -> Integer.toBinaryString(e))
                .map(e -> String.format("%1$" + Byte.SIZE + "s", e).replace(" ", "0"))
                .collect(Collectors.joining(" "));
    }




}
