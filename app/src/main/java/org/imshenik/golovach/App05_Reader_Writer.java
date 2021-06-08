package org.imshenik.golovach;

import java.io.*;


//Reader Writer - потоки char-ов.
public class App05_Reader_Writer {
    public static void main(String[] args) throws IOException {
        CharArrayWriter buff = new CharArrayWriter();
        for (int i = 0; i < 10; i++) {
            buff.write(new char[]{'H', 'e', 'l', 'l', 'o'});
        }

        char[] chars = buff.toCharArray();
        System.out.println(chars);
    }
}
