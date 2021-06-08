package org.imshenik.sandbox;

public class E {
    public static void main(String[] args) {
        print(1,2,3,4,5);
    }

    public static void print(int z, int... x){
        for (int i = 0; i < x.length; i++) {
            System.out.print(" | " + x[i]);
        }

    }
}
