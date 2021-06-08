package org.imshenik.sandbox;

public class FIXCheckSumCalculator {
    public static void main(String[] args) {
        calculate("8=FIX.4.2\u00019=61\u000135=0\u000134=28\u000149=BANZAI\u000152=20210521-08:49:11.759\u000156=FIXIMULATOR\u0001");
        calculate("8=FIX.4.2\u00019=73\u000135=A\u000134=26\u000149=BANZAI\u000152=20210521-08:48:10.765\u000156=FIXIMULATOR\u000198=0\u0001108=30\u0001");
    }

    public static void calculate(String input) {
        byte[] bytes = input.getBytes();
        int i = 0;
        for (byte b : bytes) {
            i += b;
        }
        System.out.println(i % 256);
    }
}
